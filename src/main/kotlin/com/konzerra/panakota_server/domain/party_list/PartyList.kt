package com.konzerra.panakota_server.domain.party_list

import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PartyList(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
) : EntityI