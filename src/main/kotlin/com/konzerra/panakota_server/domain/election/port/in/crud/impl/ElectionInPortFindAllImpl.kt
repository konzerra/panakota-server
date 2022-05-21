
package com.konzerra.panakota_server.domain.election.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.dto.ElectionResponseDto
import com.konzerra.panakota_server.domain.election.port.`in`.ElectionApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortFindAllAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseFindAll
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@InPort
class ElectionInPortFindAllImpl(
    override val useCaseFindAll: UseCaseFindAll<Election, ElectionResponseDto>
) : InPortFindAllAbstractImpl<Election, ElectionResponseDto>() {

    @GetMapping(ElectionApiPath.findAllPath)
    override fun findAll(): ResponseEntity<List<ElectionResponseDto>> {
        return ResponseEntity(useCaseFindAll.findAll(),HttpStatus.OK)
    }
}
    