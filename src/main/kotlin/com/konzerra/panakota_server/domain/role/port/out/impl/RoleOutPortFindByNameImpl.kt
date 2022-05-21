package com.konzerra.panakota_server.domain.role.port.out.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.role.Role
import com.konzerra.panakota_server.domain.role.RoleRepository
import com.konzerra.panakota_server.domain.role.port.out.RoleOutPortFindByName
import com.konzerra.panakota_server.exception.ResourceNotFoundException

@OutPort
class RoleOutPortFindByNameImpl(
    private val repository: RoleRepository
) : RoleOutPortFindByName {
    override fun findByName(name: String): Role {
        try{
            return repository.findRoleByName(name)
        }catch(e:RuntimeException){
            throw ResourceNotFoundException(
                className = Role::class.simpleName ?: "className",
                fieldName = Role::name.name,
                fieldValue = name
            )
        }
    }
}