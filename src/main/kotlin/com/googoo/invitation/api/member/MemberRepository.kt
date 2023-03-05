package com.googoo.invitation.api.member

import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey
import com.googoo.invitation.domain.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long> {
    fun findByIdKey(idKey: String): Member
}
