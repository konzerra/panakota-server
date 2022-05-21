
package com.konzerra.panakota_server.domain.election.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.election.Election
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortDeleteById
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseDeleteByIdAbstractImpl

@UseCase
class ElectionUseCaseDeleteByIdImpl(
    override val outPortDeleteById: OutPortDeleteById<Election, Long>
) : UseCaseDeleteByIdAbstractImpl<Election, Long>()
    