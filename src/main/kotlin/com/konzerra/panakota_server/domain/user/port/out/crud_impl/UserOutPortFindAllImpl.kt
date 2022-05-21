package com.konzerra.panakota_server.domain.user.port.out.crud_impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.UserRepository
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindAll

@OutPort
class UserOutPortFindAllImpl(
    private val repository: UserRepository
):OutPortFindAll<User> {
    override fun findAll(): List<User> {
        return repository.findAll()
    }

}