
package com.konzerra.panakota_server.domain.election.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.ElectionRepository
import com.konzerra.panakota_server.domain.election.dto.ElectionUpdateDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortUpdate

@OutPort
class ElectionOutPortUpdateImpl(
    private val outPortFindById:OutPortFindById<Election,Long>,
    private val repository: ElectionRepository,
) : OutPortUpdate<ElectionUpdateDto> {
    override fun update(updateDto: ElectionUpdateDto) {
        val election = outPortFindById.findById(updateDto.id)
        //Election.field = updateDto.field
    }
}
  