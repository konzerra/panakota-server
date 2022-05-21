package com.konzerra.panakota_server.domain.user.usecase.crud_impl


import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.user.dto.UserSaveDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortSave
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseSaveAbstractImpl

@UseCase
class UserUseCaseSaveImpl(
    override val outPortSave: OutPortSave<UserSaveDto>
) : UseCaseSaveAbstractImpl<UserSaveDto>(){

}