package com.konzerra.panakota_server.domain.candidate.candidate_old_name.dto


import com.konzerra.panakota_server.annotation.ResponseDto
import com.konzerra.panakota_server.domain.candidate.candidate_old_name.CandidateOldName
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper

@ResponseDto
class CandidateOldNameResponseDto
    : ResponseDtoI, Mapper<CandidateOldName, CandidateOldNameResponseDto>
{
    var id:Long? = null
    lateinit var name:String
    override fun toResponseDto(entity: CandidateOldName): CandidateOldNameResponseDto {
        val responseDto = CandidateOldNameResponseDto()
        responseDto.id=entity.id
        responseDto.name=entity.name
        return responseDto
    }

}