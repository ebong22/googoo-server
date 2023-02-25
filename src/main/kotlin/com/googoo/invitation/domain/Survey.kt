package com.googoo.invitation.domain

import com.googoo.invitation.domain.enum.GiftOrMeal
import jakarta.persistence.*

//@Entity
class Survey (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    invitation: Invitation,
    val name: String,
    val isVisit: Boolean,

    @Enumerated(EnumType.STRING)
    val giftOrMeal: GiftOrMeal,
    val visitors: Int //@TODO max 보기에 최대 몇명 주어지는지에 따라 n명까지면 통계에 n명 이상으로 표기
) {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "invitation_id")
    lateinit var invitation: Invitation
}
