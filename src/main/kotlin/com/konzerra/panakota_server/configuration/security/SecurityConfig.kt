package com.konzerra.panakota_server.configuration.security

import com.konzerra.panakota_server.ApiPath
import com.konzerra.panakota_server.domain.user.port.out.impl.OutPortUserGetDetailsImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.authentication.AuthenticationManager
import org.springframework.security.authentication.dao.DaoAuthenticationProvider
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, jsr250Enabled = true, prePostEnabled = true)
class SecurityConfig(
    getUserDetailsUseCaseImpl: OutPortUserGetDetailsImpl,
    jwtAuthenticationEntryPoint: JwtAuthenticationEntryPoint,
    jwtTokenFilter: JwtTokenFilter
) : WebSecurityConfigurerAdapter()
{
    private val getUserDetailsUseCaseImpl: OutPortUserGetDetailsImpl
    private val jwtAuthenticationEntryPoint: JwtAuthenticationEntryPoint
    private val jwtTokenFilter: JwtTokenFilter

    init {
        this.getUserDetailsUseCaseImpl = getUserDetailsUseCaseImpl
        this.jwtAuthenticationEntryPoint = jwtAuthenticationEntryPoint
        this.jwtTokenFilter = jwtTokenFilter
    }

    @Bean
    fun passwordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }

    @Bean
    fun authenticationProvider(): DaoAuthenticationProvider {
        val auth = DaoAuthenticationProvider()
        auth.setUserDetailsService(getUserDetailsUseCaseImpl)
        auth.setPasswordEncoder(passwordEncoder())
        return auth
    }

    @Bean
    @Throws(Exception::class)
    override fun authenticationManagerBean(): AuthenticationManager {
        return super.authenticationManagerBean()
    }

    @Throws(Exception::class)
    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.authenticationProvider(authenticationProvider())
    }

    @Throws(Exception::class)
    override fun configure(httpS: HttpSecurity) {
        // Enable CORS and disable CSRF
        var http = httpS
        http = http.cors().and().csrf().disable()

        // Set session management to stateless
        http = http
            .sessionManagement()
            .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()

        // Set unauthorized requests exception handler
        http = http
            .exceptionHandling()
            .authenticationEntryPoint(
                jwtAuthenticationEntryPoint
            )
            .and()

        // Set permissions on endpoints
        http.authorizeRequests() // Our public endpoints
            .antMatchers(
                "${ApiPath.publicPath}/**",
                "${ApiPath.protectedPath}/**",
                "/api/authenticate"
            ).permitAll() // Our private endpoints
            .anyRequest().authenticated()

        // Add JWT token filter
        http.addFilterBefore(
            jwtTokenFilter,
            UsernamePasswordAuthenticationFilter::class.java
        )
    }
}