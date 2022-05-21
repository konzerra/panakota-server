
package com.konzerra.panakota_server.domain.election.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.dto.ElectionResponseDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindAll
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseFindAllAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper

@UseCase
class ElectionUseCaseFindAllImpl(
    override val outPortFindAll: OutPortFindAll<Election>,
    override val mapper: Mapper<Election, ElectionResponseDto>
) : UseCaseFindAllAbstractImpl<Election, ElectionResponseDto>()
    