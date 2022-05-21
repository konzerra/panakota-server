package com.konzerra.panakota_server.domain.user.dto


import com.konzerra.panakota_server.annotation.ResponseDto
import com.konzerra.panakota_server.domain.role.Role
import com.konzerra.panakota_server.domain.role.dto.RoleResponseDto
import com.konzerra.panakota_server.domain.user.User
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper


@ResponseDto
class UserResponseDto : ResponseDtoI, Mapper<User, UserResponseDto>
{
    lateinit var roleMapper: Mapper<Role,RoleResponseDto>

    var id:Long? = null
    lateinit var name:String
    lateinit var email:String
    lateinit var roles:List<RoleResponseDto>
    override fun toResponseDto(entity: User): UserResponseDto {
        val responseDto = UserResponseDto()
        responseDto.id = entity.id
        responseDto.email = entity.email
        responseDto.name = entity.name
        responseDto.roles = entity.roles.map{
            roleMapper.toResponseDto(it)
        }
        return responseDto
    }
}