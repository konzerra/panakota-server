
package com.konzerra.panakota_server.domain.candidate.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.CandidateRepository
    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindAll

@OutPort
class CandidateOutPortFindAllImpl(
    private val repository: CandidateRepository
):OutPortFindAll<Candidate> {
    override fun findAll(): List<Candidate> {
        return repository.findAll()
    }

}
  