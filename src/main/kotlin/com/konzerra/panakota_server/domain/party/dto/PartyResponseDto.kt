package com.konzerra.panakota_server.domain.party.dto


import com.konzerra.panakota_server.annotation.ResponseDto
import com.konzerra.panakota_server.domain.party.Party
import com.konzerra.panakota_server.domain.party.party_old_name.PartyOldName
import com.konzerra.panakota_server.domain.party_list.PartyList
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper
import java.util.*

@ResponseDto
class PartyResponseDto
    : ResponseDtoI,
    Mapper<Party, PartyResponseDto>
{
    var id:Long? = null
    lateinit var name:String
    var oldNames:List<PartyOldName> = emptyList()
    lateinit var overview:String
    lateinit var status:String
    lateinit var established: Date
    var lists:List<PartyList> = emptyList()
    override fun toResponseDto(entity: Party): PartyResponseDto {
        TODO("Not yet implemented")
    }
}