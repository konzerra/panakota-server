package com.konzerra.panakota_server.domain.candidate.candidate_old_name.dto

import konzerra_lab_kotlin_clean_architecture.generic.data.UpdateDtoI


class CandidateOldNameUpdateDto(
    var id:Long,
    var name:String,
    var candidateId:Long
): UpdateDtoI {

}