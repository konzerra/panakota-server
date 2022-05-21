package com.konzerra.panakota_server.domain.user.dto


import konzerra_lab_kotlin_clean_architecture.generic.data.UpdateDtoI

class UserUpdateDto(
    var id: Long,
    var name: String
) : UpdateDtoI

