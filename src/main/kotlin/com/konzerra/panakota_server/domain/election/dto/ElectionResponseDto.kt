
package com.konzerra.panakota_server.domain.election.dto



import com.konzerra.panakota_server.annotation.ResponseDto
import com.konzerra.panakota_server.domain.election.Election
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper


@ResponseDto
class ElectionResponseDto : ResponseDtoI, Mapper<Election, ElectionResponseDto>
{
    //class fields
    //var id:Long? = null
    //lateinit var name:String
    override fun toResponseDto(entity: Election): ElectionResponseDto {
        val responseDto = ElectionResponseDto()
        //initalize class fields
        //responseDto.id = entity.id
        //responseDto.name = entity.name
        return responseDto
    }
}
    