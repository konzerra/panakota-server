package com.konzerra.panakota_server.domain.user.port.out.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.role.Role
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.port.out.OutPortUserGetByEmail
import com.konzerra.panakota_server.domain.user.port.out.OutPortUserGetDetails
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority

import org.springframework.security.core.userdetails.UserDetails

@UseCase
class OutPortUserGetDetailsImpl(
    private val outPortUserGetByEmail: OutPortUserGetByEmail
) : OutPortUserGetDetails {
    override fun loadUserByUsername(username: String): UserDetails {
        val user: User = outPortUserGetByEmail.getByEmail(username)
           // ?: throw UsernameNotFoundException("Invalid username or password")

        return org.springframework.security.core.userdetails.User(
            user.email,
            user.password,
            mapRolesToAuthorities(user.roles)
        )
    }
    private fun mapRolesToAuthorities(roles: List<Role>): Collection<GrantedAuthority?> {
        val authorities: List<SimpleGrantedAuthority> = roles.map {
            SimpleGrantedAuthority("ROLE_${it.name}")
        }
        return authorities
    }
}