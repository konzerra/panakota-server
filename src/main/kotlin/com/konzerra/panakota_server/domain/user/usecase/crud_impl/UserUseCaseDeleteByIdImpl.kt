package com.konzerra.panakota_server.domain.user.usecase.crud_impl


import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.user.User
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortDeleteById
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseDeleteByIdAbstractImpl

@UseCase
class UserUseCaseDeleteByIdImpl(
    override val outPortDeleteById: OutPortDeleteById<User, Long>
) : UseCaseDeleteByIdAbstractImpl<User, Long>()