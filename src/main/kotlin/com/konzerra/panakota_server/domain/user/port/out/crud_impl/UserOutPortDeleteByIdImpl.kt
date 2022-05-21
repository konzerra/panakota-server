package com.konzerra.panakota_server.domain.user.port.out.crud_impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.UserRepository
import com.konzerra.panakota_server.exception.ResourceNotFoundException
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortDeleteById

@OutPort
class UserOutPortDeleteByIdImpl(
    private val repository: UserRepository
):OutPortDeleteById<User,Long> {
    override fun deleteById(id: Long) {
        try{
            repository.deleteById(id)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = User::class.simpleName ?: "className",
                fieldName = User::id.name,
                fieldValue = id
            )
        }
    }
}