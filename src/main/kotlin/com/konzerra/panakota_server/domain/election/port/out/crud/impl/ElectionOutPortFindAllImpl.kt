
package com.konzerra.panakota_server.domain.election.port.out.crud.impl


import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.ElectionRepository
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindAll

@OutPort
class ElectionOutPortFindAllImpl(
    private val repository: ElectionRepository
):OutPortFindAll<Election> {
    override fun findAll(): List<Election> {
        return repository.findAll()
    }

}
  