
package com.konzerra.panakota_server.domain.candidate.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.candidate.dto.CandidateUpdateDto


import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortUpdate
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseUpdateAbstractImpl

@UseCase
class CandidateUseCaseUpdateImpl(
    override val outPortUpdate: OutPortUpdate<CandidateUpdateDto>
) : UseCaseUpdateAbstractImpl<CandidateUpdateDto>(){
}
    