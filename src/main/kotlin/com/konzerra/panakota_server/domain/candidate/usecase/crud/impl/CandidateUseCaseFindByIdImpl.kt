
package com.konzerra.panakota_server.domain.candidate.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.candidate.Candidate

    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseFindByIdAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper

@UseCase
class CandidateUseCaseFindByIdImpl(
    override val outPortFindById: OutPortFindById<Candidate, Long>,
    override val mapper: Mapper<Candidate, CandidateResponseDto>
) : UseCaseFindByIdAbstractImpl<Candidate, Long, CandidateResponseDto>()
    