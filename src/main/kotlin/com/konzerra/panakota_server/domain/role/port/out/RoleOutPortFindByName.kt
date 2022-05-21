package com.konzerra.panakota_server.domain.role.port.out

import com.konzerra.panakota_server.domain.role.Role

interface RoleOutPortFindByName {
    fun findByName(name:String): Role
}