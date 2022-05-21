
package com.konzerra.panakota_server.domain.candidate.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.dto.CandidateResponseDto
import com.konzerra.panakota_server.domain.candidate.port.`in`.CandidateApiPath
    

import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindById
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortFindByIdAbstractImpl

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class CandidateInPortFindByIdImpl(
    override val useCaseFindById: UseCaseFindById<Candidate, Long, CandidateResponseDto>
) : InPortFindByIdAbstractImpl<Candidate, Long, CandidateResponseDto>() {

    @GetMapping(CandidateApiPath.findByIdPath)
    override fun findById(@PathVariable id: Long): ResponseEntity<CandidateResponseDto> {
        return ResponseEntity(useCaseFindById.findById(id),HttpStatus.OK)
    }

}
    