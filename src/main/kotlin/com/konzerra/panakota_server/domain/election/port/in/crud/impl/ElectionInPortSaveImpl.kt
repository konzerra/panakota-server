
package com.konzerra.panakota_server.domain.election.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.dto.ElectionSaveDto
import com.konzerra.panakota_server.domain.election.port.`in`.ElectionApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortSaveAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseSave
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@InPort
class ElectionInPortSaveImpl(
    override val useCaseInPortSave: UseCaseSave<ElectionSaveDto>
) : InPortSaveAbstractImpl<Election, Long, ElectionSaveDto>() {

    @PostMapping(ElectionApiPath.savePath)
    override fun save(@RequestBody saveDto: ElectionSaveDto): ResponseEntity<*> {
        useCaseInPortSave.save(saveDto)
        return ResponseEntity<Any>(HttpStatus.CREATED)
    }
}
    