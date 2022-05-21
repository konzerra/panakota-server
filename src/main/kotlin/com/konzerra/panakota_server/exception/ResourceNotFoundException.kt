package com.konzerra.panakota_server.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND)
class ResourceNotFoundException(
    val className:String,
    val fieldName:String,
    val fieldValue:Any
) : RuntimeException(
    "$className not found with $fieldName : '$fieldValue'"
) {

}