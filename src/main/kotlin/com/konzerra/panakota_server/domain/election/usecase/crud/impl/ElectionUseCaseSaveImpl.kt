
package com.konzerra.panakota_server.domain.election.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.election.dto.ElectionSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortSave
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseSaveAbstractImpl

@UseCase
class ElectionUseCaseSaveImpl(
    override val outPortSave: OutPortSave<ElectionSaveDto>
) : UseCaseSaveAbstractImpl<ElectionSaveDto>(){

}
    