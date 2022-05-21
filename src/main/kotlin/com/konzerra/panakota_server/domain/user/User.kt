package com.konzerra.panakota_server.domain.user

import com.konzerra.panakota_server.domain.role.Role
import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import javax.persistence.*


@Entity

class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    var name:String,
    var email:String,
    var password:String,
    @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.REFRESH])
    var roles:List<Role> = emptyList()
): EntityI {

}