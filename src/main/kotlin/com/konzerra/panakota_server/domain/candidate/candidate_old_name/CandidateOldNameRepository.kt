package com.konzerra.panakota_server.domain.candidate.candidate_old_name

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CandidateOldNameRepository : JpaRepository<CandidateOldName,Long>{
}