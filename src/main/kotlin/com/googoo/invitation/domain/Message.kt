package com.googoo.invitation.domain

import jakarta.persistence.*

@Entity
class Message (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    invitation: Invitation,
    val name: String,
    val password: String,
    val contents: String,
    var isDelete: Boolean = false // 삭제여부 (추후 복구 요청이 있을 수도 있기 때문에 사용)
) {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invitation_id")
    lateinit var invitation: Invitation

    override fun toString(): String {
        return "Message(id=$id, name='$name', password='$password', contents='$contents', isDelete=$isDelete)"
    }
}

