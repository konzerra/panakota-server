
package com.konzerra.panakota_server.domain.election.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.ElectionRepository
import com.konzerra.panakota_server.domain.election.dto.ElectionSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortEntityFromSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortSave

@OutPort
class ElectionOutPortSaveImpl(
    private val repository: ElectionRepository,
    private val outPortEntityFromSaveDto: OutPortEntityFromSaveDto<Election, ElectionSaveDto>
):OutPortSave<ElectionSaveDto> {
    override fun save(saveDto: ElectionSaveDto) {
        repository.save(outPortEntityFromSaveDto.entityFromSaveDto(saveDto))
    }

}
  