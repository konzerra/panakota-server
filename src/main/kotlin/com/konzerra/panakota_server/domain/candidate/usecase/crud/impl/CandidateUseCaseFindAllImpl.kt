
package com.konzerra.panakota_server.domain.candidate.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.candidate.Candidate

    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindAll
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseFindAllAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper

@UseCase
class CandidateUseCaseFindAllImpl(
    override val outPortFindAll: OutPortFindAll<Candidate>,
    override val mapper: Mapper<Candidate, CandidateResponseDto>
) : UseCaseFindAllAbstractImpl<Candidate, CandidateResponseDto>()
    