package com.konzerra.panakota_server.domain.user.dto

import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI


class UserSaveDto(
    var name:String,
    var email:String,
    var password:String
): SaveDtoI

