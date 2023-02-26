package com.googoo.invitation.domain

import jakarta.persistence.*

@Entity
class Album (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    invitation: Invitation,
    val fileName: String,
    var dpSequence: Int
) {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invitation_id")
    lateinit var invitation: Invitation

    //@TODO INVITATION 넣어줘야 함
    override fun toString(): String {
        return "Album(id=$id, fileName='$fileName', dpSequence=$dpSequence)"
    }
}