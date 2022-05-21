package com.konzerra.panakota_server

class ApiPath {
    companion object{
        private const val apiVersion:String = "/api/v1"
        const val publicPath:String = "$apiVersion/public"
        const val protectedPath:String = "$apiVersion/protected"
    }
}