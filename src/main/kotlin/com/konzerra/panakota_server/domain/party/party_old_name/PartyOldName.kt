package com.konzerra.panakota_server.domain.party.party_old_name


import com.konzerra.panakota_server.domain.party.Party
import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import javax.persistence.*

@Entity
class PartyOldName(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    @ManyToOne
    var party:Party
): EntityI {
}