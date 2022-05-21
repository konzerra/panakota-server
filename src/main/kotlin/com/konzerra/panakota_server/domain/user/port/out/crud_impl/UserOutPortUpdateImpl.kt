package com.konzerra.panakota_server.domain.user.port.out.crud_impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.UserRepository
import com.konzerra.panakota_server.domain.user.dto.UserUpdateDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortUpdate

@OutPort
class UserOutPortUpdateImpl(
    private val outPortFindById:OutPortFindById<User,Long>,
    private val repository: UserRepository
) : OutPortUpdate<UserUpdateDto> {
    override fun update(updateDto: UserUpdateDto) {
        val user = outPortFindById.findById(updateDto.id)
        user.name = updateDto.name

        repository.save(user)
    }
}