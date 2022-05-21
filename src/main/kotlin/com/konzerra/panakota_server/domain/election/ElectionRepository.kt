package com.konzerra.panakota_server.domain.election


import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface ElectionRepository:JpaRepository<Election,Long> {
}