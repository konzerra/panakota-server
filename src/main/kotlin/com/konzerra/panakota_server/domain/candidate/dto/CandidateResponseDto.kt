
package  com.konzerra.panakota_server.domain.candidate.dto

import  com.konzerra.panakota_server.annotation.ResponseDto
import  com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.candidate_old_name.CandidateOldName
import com.konzerra.panakota_server.domain.candidate.candidate_old_name.dto.CandidateOldNameResponseDto
import com.konzerra.panakota_server.domain.party_list.PartyList


import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper
import org.springframework.beans.factory.annotation.Autowired
import java.util.*
import javax.persistence.*


@ResponseDto
class CandidateResponseDto() : ResponseDtoI, Mapper<Candidate, CandidateResponseDto>
{
    @Autowired
    private lateinit var oldNameMapper: Mapper<CandidateOldName,CandidateOldNameResponseDto>

    var id:Long? = null
    lateinit var name:String
    lateinit var overview:String
    var birthDate: Date?=null
    var oldNames:List<CandidateOldNameResponseDto> = emptyList()
    override fun toResponseDto(entity: Candidate): CandidateResponseDto {
        val responseDto = CandidateResponseDto()
        //initalize class fields
        responseDto.id = entity.id
        responseDto.name = entity.name
        responseDto.birthDate = entity.birthDate
        responseDto.oldNames = entity.oldNames.map {
            oldNameMapper.toResponseDto(it)
        }
        return responseDto
    }
}
    