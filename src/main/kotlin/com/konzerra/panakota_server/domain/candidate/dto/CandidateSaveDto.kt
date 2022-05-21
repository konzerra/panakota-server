
package  com.konzerra.panakota_server.domain.candidate.dto
    

import com.konzerra.panakota_server.domain.candidate.candidate_old_name.CandidateOldName
import com.konzerra.panakota_server.domain.party_list.PartyList
import konzerra_lab_kotlin_clean_architecture.generic.data.SaveDtoI
import java.util.Date
import javax.persistence.*

class CandidateSaveDto(
    var name:String,
    var overview:String,
    var birthDate:Date?,
): SaveDtoI
    