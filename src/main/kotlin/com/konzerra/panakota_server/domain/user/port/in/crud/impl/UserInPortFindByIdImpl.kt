package com.konzerra.panakota_server.domain.user.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.dto.UserResponseDto
import com.konzerra.panakota_server.domain.user.port.`in`.UserApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortFindByIdAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindById
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class UserInPortFindByIdImpl(
    override val useCaseFindById: UseCaseFindById<User, Long, UserResponseDto>
) : InPortFindByIdAbstractImpl<User, Long, UserResponseDto>() {

    @GetMapping(UserApiPath.findByIdPath)
    override fun findById(@PathVariable id: Long): ResponseEntity<UserResponseDto> {
        return ResponseEntity(useCaseFindById.findById(id),HttpStatus.OK)
    }

}