
package com.konzerra.panakota_server.domain.candidate.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.CandidateRepository
    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById

@OutPort
class CandidateOutPortFindByIdImpl(
    private val repository: CandidateRepository
):OutPortFindById<Candidate,Long> {
    override fun findById(id: Long): Candidate {
        return repository.findById(id).orElseThrow {
            ResourceNotFoundException(
                className = Candidate::class.simpleName ?: "className",
                fieldName = Candidate::id.name,
                fieldValue = id
            )
        }


    }
}
  