
package com.konzerra.panakota_server.domain.candidate.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.CandidateRepository
    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortDeleteById

@OutPort
class CandidateOutPortDeleteByIdImpl(
private val repository: CandidateRepository
) :OutPortDeleteById<Candidate,Long>{
  override fun deleteById(id: Long) {
      repository.deleteById(id)
  }
}
  