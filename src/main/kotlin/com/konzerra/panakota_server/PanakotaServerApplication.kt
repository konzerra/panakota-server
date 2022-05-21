package com.konzerra.panakota_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PanakotaServerApplication

fun main(args: Array<String>) {
    runApplication<PanakotaServerApplication>(*args)
}
