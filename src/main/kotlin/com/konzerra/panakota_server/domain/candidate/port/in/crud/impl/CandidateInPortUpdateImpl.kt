
package com.konzerra.panakota_server.domain.candidate.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.dto.CandidateUpdateDto
import com.konzerra.panakota_server.domain.candidate.port.`in`.CandidateApiPath
    

import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortUpdateAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseUpdate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping

@InPort
class CandidateInPortUpdateImpl(
    override val useCaseUpdate: UseCaseUpdate<CandidateUpdateDto>
) : InPortUpdateAbstractImpl<Candidate, Long, CandidateUpdateDto>() {

    @PutMapping(CandidateApiPath.updatePath)
    override fun update(updateDto: CandidateUpdateDto): ResponseEntity<*> {
        useCaseUpdate.update(updateDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}
    