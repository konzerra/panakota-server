
package com.konzerra.panakota_server.domain.election.port.`in`

import com.konzerra.panakota_server.ApiPath


class ElectionApiPath {
    companion object{
        private const val basePath = "/election"
        const val protectedPath = "${ApiPath.protectedPath}$basePath"
        const val publicPath = "${ApiPath.publicPath}/election"

        const val findByIdPath = "$publicPath/{id}"
        const val findAllPath = "$publicPath/all"

        const val savePath = protectedPath
        const val updatePath = protectedPath
        const val deleteByIdPath = "$protectedPath/{id}"
    }
}
    