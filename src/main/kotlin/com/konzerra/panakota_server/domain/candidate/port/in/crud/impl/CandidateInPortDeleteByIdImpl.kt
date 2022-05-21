
package com.konzerra.panakota_server.domain.candidate.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.candidate.Candidate
import com.konzerra.panakota_server.domain.candidate.port.`in`.CandidateApiPath
    

import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortDeleteByIdAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseDeleteById

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@InPort
class  CandidateInPortDeleteByIdImpl(
    override val useCaseDeleteById: UseCaseDeleteById<Candidate, Long>
) : InPortDeleteByIdAbstractImpl<Candidate, Long>()
{
    @DeleteMapping(CandidateApiPath.deleteByIdPath)
    override fun deleteById(@PathVariable id: Long): ResponseEntity<*> {
        useCaseDeleteById.deleteById(id)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}
    