package com.konzerra.panakota_server.domain.candidate


import com.konzerra.panakota_server.domain.candidate.candidate_old_name.CandidateOldName
import com.konzerra.panakota_server.domain.party_list.PartyList
import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import java.util.Date
import javax.persistence.*

@Entity
class Candidate(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    @Column(length = 1024)
    var overview:String,
    var birthDate:Date?=null,
    @OneToMany(mappedBy = "candidate",cascade = [CascadeType.ALL],fetch = FetchType.EAGER)
    var oldNames:List<CandidateOldName> = emptyList(),
    @ManyToMany(fetch = FetchType.LAZY)
    var partyHistory:List<PartyList> = emptyList()
): EntityI