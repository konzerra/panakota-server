package com.konzerra.panakota_server.domain.user.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.dto.UserResponseDto
import com.konzerra.panakota_server.domain.user.port.`in`.UserApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortFindAllAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindAll
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@InPort
class UserInPortFindAllImpl(
    override val useCaseFindAll: UseCaseFindAll<User, UserResponseDto>
) : InPortFindAllAbstractImpl<User, UserResponseDto>() {

    @GetMapping(UserApiPath.findAllPath)
    override fun findAll(): ResponseEntity<List<UserResponseDto>> {
        return ResponseEntity(useCaseFindAll.findAll(),HttpStatus.OK)
    }
}