
package com.konzerra.panakota_server.domain.election.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.dto.ElectionResponseDto
import com.konzerra.panakota_server.domain.election.port.`in`.ElectionApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortFindByIdAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindById
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class ElectionInPortFindByIdImpl(
    override val useCaseFindById: UseCaseFindById<Election, Long, ElectionResponseDto>
) : InPortFindByIdAbstractImpl<Election, Long, ElectionResponseDto>() {

    @GetMapping(ElectionApiPath.findByIdPath)
    override fun findById(@PathVariable id: Long): ResponseEntity<ElectionResponseDto> {
        return ResponseEntity(useCaseFindById.findById(id),HttpStatus.OK)
    }

}
    