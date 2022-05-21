package com.konzerra.panakota_server.domain.user.port.out

import com.konzerra.panakota_server.domain.user.User


interface OutPortUserGetByEmail {
    fun getByEmail(email:String): User
}