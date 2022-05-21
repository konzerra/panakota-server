package com.konzerra.panakota_server.domain.party.party_old_name.dto


import com.konzerra.panakota_server.annotation.ResponseDto
import com.konzerra.panakota_server.domain.party.party_old_name.PartyOldName
import konzerra_lab_kotlin_clean_architecture.generic.data.ResponseDtoI
import konzerra_lab_kotlin_clean_architecture.generic.util.Mapper
import kotlin.properties.Delegates

@ResponseDto
class PartyOldNameResponseDto
    : ResponseDtoI,
    Mapper<PartyOldName, PartyOldNameResponseDto>
{
    var id:Long? = null
    lateinit var name:String
    var partyId by Delegates.notNull<Long>()
    override fun toResponseDto(entity: PartyOldName): PartyOldNameResponseDto {
        TODO("Not yet implemented")
    }
}