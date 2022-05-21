
package com.konzerra.panakota_server.domain.candidate.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.dto.CandidateResponseDto
import com.konzerra.panakota_server.domain.candidate.port.`in`.CandidateApiPath
    

import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortFindAllAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindAll
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@InPort
class CandidateInPortFindAllImpl(
    override val useCaseFindAll: UseCaseFindAll<Candidate, CandidateResponseDto>
) : InPortFindAllAbstractImpl<Candidate, CandidateResponseDto>() {

    @GetMapping(CandidateApiPath.findAllPath)
    override fun findAll(): ResponseEntity<List<CandidateResponseDto>> {
        return ResponseEntity(useCaseFindAll.findAll(),HttpStatus.OK)
    }
}
    