package com.konzerra.panakota_server.domain.user.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.dto.UserUpdateDto
import com.konzerra.panakota_server.domain.user.port.`in`.UserApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortUpdateAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseUpdate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping

@InPort
class UserInPortUpdateImpl(
    override val useCaseUpdate: UseCaseUpdate<UserUpdateDto>
) : InPortUpdateAbstractImpl<User, Long, UserUpdateDto>() {

    @PutMapping(UserApiPath.updatePath)
    override fun update(updateDto: UserUpdateDto): ResponseEntity<*> {
        useCaseUpdate.update(updateDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}