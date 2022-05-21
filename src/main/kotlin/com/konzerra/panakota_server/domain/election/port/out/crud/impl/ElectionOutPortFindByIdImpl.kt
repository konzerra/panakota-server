
package com.konzerra.panakota_server.domain.election.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.ElectionRepository
import com.konzerra.panakota_server.exception.ResourceNotFoundException
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById

@OutPort
class ElectionOutPortFindByIdImpl(
    private val repository: ElectionRepository
):OutPortFindById<Election,Long> {
    override fun findById(id: Long): Election {
        return repository.findById(id).orElseThrow {
            ResourceNotFoundException(
                className = Election::class.simpleName ?: "className",
                fieldName = Election::id.name,
                fieldValue = id
            )
        }


    }
}
  