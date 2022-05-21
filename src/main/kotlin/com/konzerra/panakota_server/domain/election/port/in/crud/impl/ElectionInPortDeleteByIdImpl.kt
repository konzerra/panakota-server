
package com.konzerra.panakota_server.domain.election.port.`in`.crud.impl

import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.election.Election
import com.konzerra.panakota_server.domain.election.port.`in`.ElectionApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortDeleteByIdAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseDeleteById

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

@InPort
class  ElectionInPortDeleteByIdImpl(
    override val useCaseDeleteById: UseCaseDeleteById<Election, Long>
) : InPortDeleteByIdAbstractImpl<Election, Long>()
{
    @DeleteMapping(ElectionApiPath.deleteByIdPath)
    override fun deleteById(@PathVariable id: Long): ResponseEntity<*> {
        useCaseDeleteById.deleteById(id)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}
    