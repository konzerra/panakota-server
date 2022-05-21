package com.konzerra.panakota_server.domain.role.dto

import com.konzerra.panakota_server.annotation.ResponseDto
import com.konzerra.panakota_server.domain.role.Role
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper

@ResponseDto
class RoleResponseDto: ResponseDtoI,Mapper<Role,RoleResponseDto> {
    lateinit var name:String
    override fun toResponseDto(entity: Role): RoleResponseDto {
        val responseDto = RoleResponseDto()
        responseDto.name = entity.name
        return responseDto
    }
}