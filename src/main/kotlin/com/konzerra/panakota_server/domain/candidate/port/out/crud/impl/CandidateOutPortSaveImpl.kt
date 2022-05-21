
package com.konzerra.panakota_server.domain.candidate.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.CandidateRepository
import com.konzerra.panakota_server.domain.candidate.dto.CandidateSaveDto


import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortEntityFromSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortSave

@OutPort
class CandidateOutPortSaveImpl(
    private val repository: CandidateRepository,
    private val outPortEntityFromSaveDto: OutPortEntityFromSaveDto<Candidate,CandidateSaveDto>
):OutPortSave<CandidateSaveDto> {
    override fun save(saveDto: CandidateSaveDto) {
        repository.save(outPortEntityFromSaveDto.entityFromSaveDto(saveDto))
    }

}
  