package com.konzerra.panakota_server.domain.user.port.out.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.UserRepository
import com.konzerra.panakota_server.domain.user.port.out.OutPortUserGetByEmail
import com.konzerra.panakota_server.exception.ResourceNotFoundException

@OutPort
class OutPortUserGetByEmailImpl(
    private val repository: UserRepository
) : OutPortUserGetByEmail {
    override fun getByEmail(email: String): User {
        try{
            return repository.findByEmail(email)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = User::class.simpleName ?: "className",
                fieldName = User::id.name,
                fieldValue = email
            )
        }

    }
}