
package com.konzerra.panakota_server.domain.election.port.out.crud.impl

import com.konzerra.panakota_server.annotation.OutPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.dto.ElectionSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortEntityFromSaveDto

@OutPort
class ElectionOutPortFromSaveDtoImpl: OutPortEntityFromSaveDto<Election, ElectionSaveDto> {
    override fun entityFromSaveDto(saveDto: ElectionSaveDto): Election {
        return Election(
            //model.field = saveDto.field
            //name = saveDto.name,
        )
    }
}
  