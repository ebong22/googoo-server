package com.googoo.invitation.api.member

import com.googoo.invitation.domain.Member

interface MemberService {

    fun findById(id: Long): Any?
    fun save(member: Member)
}