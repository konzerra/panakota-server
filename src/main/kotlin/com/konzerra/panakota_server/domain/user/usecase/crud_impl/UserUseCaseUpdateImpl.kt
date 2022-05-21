package com.konzerra.panakota_server.domain.user.usecase.crud_impl


import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.user.dto.UserUpdateDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortUpdate
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseUpdateAbstractImpl

@UseCase
class UserUseCaseUpdateImpl(
    override val outPortUpdate: OutPortUpdate<UserUpdateDto>
) : UseCaseUpdateAbstractImpl<UserUpdateDto>(){
}