
package com.konzerra.panakota_server.domain.election.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.dto.ElectionUpdateDto
import com.konzerra.panakota_server.domain.election.port.`in`.ElectionApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortUpdateAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseUpdate
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PutMapping

@InPort
class ElectionInPortUpdateImpl(
    override val useCaseUpdate: UseCaseUpdate<ElectionUpdateDto>
) : InPortUpdateAbstractImpl<Election, Long, ElectionUpdateDto>() {

    @PutMapping(ElectionApiPath.updatePath)
    override fun update(updateDto: ElectionUpdateDto): ResponseEntity<*> {
        useCaseUpdate.update(updateDto)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}
    