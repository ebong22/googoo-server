package com.googoo.invitation.domain

import jakarta.persistence.*

@Entity
class Member (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var name: String,
    var tel: String,
    var mail: String,
    var etc: String,
    var exTraDate: Int = 0,
    var quickRequest: Boolean
)