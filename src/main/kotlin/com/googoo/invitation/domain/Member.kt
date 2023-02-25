package com.googoo.invitation.domain

import jakarta.persistence.*

@Entity
class Member (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    var name: String,
    var tel: String,
    var mail: String,
    var etc: String?,
    var extraDays: Int = 0, // 서버 연장일(추가X = 0 / 추가시 1,2,3... -> 1일, 1주일 등 기준으로 잡은 일수)
    var isQuickRequest: Boolean = false // 빠른 제작 여부
){
    override fun toString(): String {
        return "Member(id=$id, name='$name', tel='$tel', mail='$mail', etc=$etc, extraDays=$extraDays, isQuickRequest=$isQuickRequest)"
    }
}