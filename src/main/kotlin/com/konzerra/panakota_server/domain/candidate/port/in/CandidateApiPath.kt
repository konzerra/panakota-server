
package  com.konzerra.panakota_server.domain.candidate.port.`in`

import  com.konzerra.panakota_server.ApiPath
    


class CandidateApiPath {
    companion object{
        private const val basePath = "/candidate"
        const val protectedPath = "${ApiPath.protectedPath}$basePath"
        const val publicPath = "${ApiPath.publicPath}/candidate"

        const val findByIdPath = "$publicPath/{id}"
        const val findAllPath = "$publicPath/all"

        const val savePath = protectedPath
        const val updatePath = protectedPath
        const val deleteByIdPath = "$protectedPath/{id}"
    }
}
    