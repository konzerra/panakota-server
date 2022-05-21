package com.konzerra.panakota_server.domain.election


import com.konzerra.panakota_server.domain.party_list.PartyList
import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import javax.persistence.*

@Entity
class Election(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    @Column(length = 1024)
    var overview:String,
    var status:String,
    @OneToMany()
    var partyLists:List<PartyList> = emptyList()

): EntityI {

}