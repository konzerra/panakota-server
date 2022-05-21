
package com.konzerra.panakota_server.domain.candidate.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.dto.CandidateSaveDto
    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortEntityFromSaveDto

@OutPort
class CandidateOutPortFromSaveDtoImpl: OutPortEntityFromSaveDto<Candidate, CandidateSaveDto> {
    override fun entityFromSaveDto(saveDto: CandidateSaveDto): Candidate {

        return Candidate(
            name = saveDto.name,
            overview = saveDto.overview,
            birthDate = saveDto.birthDate
        )
    }
}
  