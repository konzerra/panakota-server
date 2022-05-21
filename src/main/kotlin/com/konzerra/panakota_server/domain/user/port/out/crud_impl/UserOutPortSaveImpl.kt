package com.konzerra.panakota_server.domain.user.port.out.crud_impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.UserRepository
import com.konzerra.panakota_server.domain.user.dto.UserSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortEntityFromSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortSave

@OutPort
class UserOutPortSaveImpl(
    private val repository: UserRepository,
    private val outPortEntityFromSaveDto: OutPortEntityFromSaveDto<User,UserSaveDto>
):OutPortSave<UserSaveDto> {
    override fun save(saveDto: UserSaveDto) {
        repository.save(outPortEntityFromSaveDto.entityFromSaveDto(saveDto))
    }

}