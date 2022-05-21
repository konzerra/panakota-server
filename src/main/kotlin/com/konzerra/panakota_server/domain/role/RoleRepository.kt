package com.konzerra.panakota_server.domain.role

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface RoleRepository:JpaRepository<Role,Long> {
    fun findRoleByName(name: String): Role
}
