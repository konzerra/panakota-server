package com.konzerra.panakota_server.domain.user.port.out.crud_impl


import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.role.port.out.RoleOutPortFindByName
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.dto.UserSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortEntityFromSaveDto

@OutPort
class UserOutPortFromSaveDtoImpl(
    private val roleOutPortFindByName: RoleOutPortFindByName
): OutPortEntityFromSaveDto<User, UserSaveDto> {
    override fun entityFromSaveDto(saveDto: UserSaveDto): User {
        return User(
            name = saveDto.name,
            email = saveDto.email,
            password = saveDto.password,
            roles = listOf(roleOutPortFindByName.findByName("User"))
        )
    }
}