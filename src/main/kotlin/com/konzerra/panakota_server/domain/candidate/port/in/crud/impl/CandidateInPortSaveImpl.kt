
package com.konzerra.panakota_server.domain.candidate.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.dto.CandidateSaveDto
import com.konzerra.panakota_server.domain.candidate.port.`in`.CandidateApiPath

import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortSaveAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseSave

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@InPort
class CandidateInPortSaveImpl(
    override val useCaseInPortSave: UseCaseSave<CandidateSaveDto>
) : InPortSaveAbstractImpl<Candidate, Long, CandidateSaveDto>() {

    @PostMapping(CandidateApiPath.savePath)
    override fun save(@RequestBody saveDto: CandidateSaveDto): ResponseEntity<*> {
        useCaseInPortSave.save(saveDto)
        return ResponseEntity<Any>(HttpStatus.CREATED)
    }
}
    