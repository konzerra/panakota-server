package com.konzerra.panakota_server.domain.candidate.candidate_old_name.dto

import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI


class CandidateOldNameSaveDto(
    var name:String,
    var candidateId:Long
): SaveDtoI {

}