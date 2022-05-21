package com.konzerra.panakota_server.annotation

import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component


@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
@Component
@Scope("prototype")
annotation class ResponseDto()
