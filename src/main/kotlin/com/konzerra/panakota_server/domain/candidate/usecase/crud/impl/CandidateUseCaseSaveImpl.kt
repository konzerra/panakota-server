
package com.konzerra.panakota_server.domain.candidate.usecase.crud.impl

import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.candidate.Candidate

    

import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortSave
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseSaveAbstractImpl

@UseCase
class CandidateUseCaseSaveImpl(
    override val outPortSave: OutPortSave<CandidateSaveDto>
) : UseCaseSaveAbstractImpl<CandidateSaveDto>(){

}
    