
package com.konzerra.panakota_server.domain.election.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.ElectionRepository
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortDeleteById

@OutPort
class ElectionOutPortDeleteByIdImpl(
private val repository: ElectionRepository
) :OutPortDeleteById<Election,Long>{
  override fun deleteById(id: Long) {
      repository.deleteById(id)
  }
}
  