
package com.konzerra.panakota_server.domain.candidate.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.candidate.Candidate

    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortDeleteById
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseDeleteByIdAbstractImpl

@UseCase
class CandidateUseCaseDeleteByIdImpl(
    override val outPortDeleteById: OutPortDeleteById<Candidate, Long>
) : UseCaseDeleteByIdAbstractImpl<Candidate, Long>()
    