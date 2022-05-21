package com.konzerra.panakota_server.domain.user.port.out.crud_impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.UserRepository
import com.konzerra.panakota_server.exception.ResourceNotFoundException
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById

@OutPort
class UserOutPortFindByIdImpl(
    private val repository: UserRepository
):OutPortFindById<User,Long> {
    override fun findById(id: Long): User {
        return repository.findById(id).orElseThrow {
            ResourceNotFoundException(
                className = User::class.simpleName ?: "className",
                fieldName = User::id.name,
                fieldValue = id
            )
        }


    }
}