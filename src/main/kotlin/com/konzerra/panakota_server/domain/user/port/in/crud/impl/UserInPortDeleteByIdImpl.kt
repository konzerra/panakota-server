package com.konzerra.panakota_server.domain.user.port.`in`.crud.impl


import com.konzerra.panakota_server.annotation.InPort
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.port.`in`.UserApiPath
import konzerra_lab_kotlin_clean_architecture.generic.port.`in`.crud.abstract_impl.InPortDeleteByIdAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.UseCaseDeleteById
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

@InPort
class UserInPortDeleteByIdImpl(
    override val useCaseDeleteById: UseCaseDeleteById<User, Long>
) : InPortDeleteByIdAbstractImpl<User, Long>()
{
    @DeleteMapping(UserApiPath.deleteByIdPath)
    override fun deleteById(@PathVariable id: Long): ResponseEntity<*> {
        useCaseDeleteById.deleteById(id)
        return ResponseEntity<Any>(HttpStatus.OK)
    }
}
