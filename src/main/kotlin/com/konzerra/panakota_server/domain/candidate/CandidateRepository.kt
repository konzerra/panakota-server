package com.konzerra.panakota_server.domain.candidate

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface CandidateRepository : JpaRepository<Candidate,Long>{
}