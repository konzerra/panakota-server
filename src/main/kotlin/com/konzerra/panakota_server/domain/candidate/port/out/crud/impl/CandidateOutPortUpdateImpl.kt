
package com.konzerra.panakota_server.domain.candidate.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.CandidateRepository
import com.konzerra.panakota_server.domain.candidate.dto.CandidateUpdateDto


import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortUpdate

@OutPort
class CandidateOutPortUpdateImpl(
    private val outPortFindById:OutPortFindById<Candidate,Long>,
    private val repository: CandidateRepository
) : OutPortUpdate<CandidateUpdateDto> {
    override fun update(updateDto: CandidateUpdateDto) {
        val candidate = outPortFindById.findById(updateDto.id)
        //candidate.field = updateDto.field

        repository.save(candidate)
    }
}
  