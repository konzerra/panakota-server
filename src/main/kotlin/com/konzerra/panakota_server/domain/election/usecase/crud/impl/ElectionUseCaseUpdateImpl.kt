
package com.konzerra.panakota_server.domain.election.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.election.dto.ElectionUpdateDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortUpdate
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseUpdateAbstractImpl

@UseCase
class ElectionUseCaseUpdateImpl(
    override val outPortUpdate: OutPortUpdate<ElectionUpdateDto>
) : UseCaseUpdateAbstractImpl<ElectionUpdateDto>(){
}
    