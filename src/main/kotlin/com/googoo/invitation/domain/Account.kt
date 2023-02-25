package com.googoo.invitation.domain

import com.googoo.invitation.domain.enum.Bank
import com.googoo.invitation.domain.enum.Relation
import jakarta.persistence.*

@Entity
class Account (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    invitation: Invitation,

    @Enumerated(EnumType.STRING)
    var relation: Relation,
    var name: String,
    var tel: String,
    var kakaoId: String?, // @TODO 안쓰면 나중에 삭제

    @Enumerated(EnumType.STRING)
    var bank: Bank,
    var accountNumber: String
) {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invitation_id")
    lateinit var invitation: Invitation

    //@TODO INVITATION 넣어줘야 함
    override fun toString(): String {
        return "Account(id=$id, relation='$relation', name='$name', bank='$bank', accountNumber='$accountNumber', tel='$tel', kakaoId='$kakaoId')"
    }
}