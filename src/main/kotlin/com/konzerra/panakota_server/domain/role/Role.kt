package com.konzerra.panakota_server.domain.role

import com.konzerra.panakota_server.domain.user.User
import konzerra_lab_kotlin_clean_architecture.generic.data.EntityI
import javax.persistence.*

@Entity
class Role(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id:Long? = null,
    @Column(unique = true)
    var name:String,
    @ManyToMany(mappedBy = "roles",fetch = FetchType.LAZY, cascade = [CascadeType.REFRESH])
    var users:List<User> = emptyList()
) :EntityI{
}