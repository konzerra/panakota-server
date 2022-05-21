package com.konzerra.panakota_server.domain.candidate.candidate_old_name

import com.konzerra.panakota_server.domain.candidate.Candidate
import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class CandidateOldName(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    @ManyToOne
    var candidate: Candidate
): EntityI {
}