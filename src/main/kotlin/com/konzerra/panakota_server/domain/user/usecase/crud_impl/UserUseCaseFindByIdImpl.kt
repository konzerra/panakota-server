package com.konzerra.panakota_server.domain.user.usecase.crud_impl




import com.konzerra.panakota_server.annotation.UseCase
import com.konzerra.panakota_server.domain.user.User
import com.konzerra.panakota_server.domain.user.dto.UserResponseDto
import konzerra_lab_kotlin_clean_architecture.generic.port.out.crud.OutPortFindById
import konzerra_lab_kotlin_clean_architecture.generic.usecase.crud.abstract_impl.UseCaseFindByIdAbstractImpl
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper

@UseCase
class UserUseCaseFindByIdImpl(
    override val outPortFindById: OutPortFindById<User, Long>,
    override val mapper: Mapper<User, UserResponseDto>
) : UseCaseFindByIdAbstractImpl<User, Long, UserResponseDto>()