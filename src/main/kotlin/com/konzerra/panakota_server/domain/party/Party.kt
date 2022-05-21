package com.konzerra.panakota_server.domain.party

import com.konzerra.panakota_server.domain.party.party_old_name.PartyOldName
import com.konzerra.panakota_server.domain.party_list.PartyList
import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import java.util.Date
import javax.persistence.*

@Entity
class Party(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    @OneToMany(mappedBy = "party",cascade = [CascadeType.ALL])
    var oldNames:List<PartyOldName> = emptyList(),
    @Column(length = 1024)
    var overview:String,
    var status:String,
    var established:Date,
    @OneToMany
    var lists:List<PartyList> = emptyList()
): EntityI