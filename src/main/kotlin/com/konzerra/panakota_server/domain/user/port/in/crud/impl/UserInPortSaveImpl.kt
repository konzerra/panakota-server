package com.konzerra.panakota_server.domain.user.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.dto.UserSaveDto
import com.konzerra.panakota_server.domain.user.port.`in`.UserApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortSaveAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseSave
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@InPort
class UserInPortSaveImpl(
    override val useCaseInPortSave: UseCaseSave<UserSaveDto>
) : InPortSaveAbstractImpl<User, Long, UserSaveDto>() {

    @PostMapping(UserApiPath.savePath)
    override fun save(@RequestBody saveDto: UserSaveDto): ResponseEntity<*> {
        useCaseInPortSave.save(saveDto)
        return ResponseEntity<Any>(HttpStatus.CREATED)
    }
}