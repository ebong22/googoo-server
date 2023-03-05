package com.googoo.invitation.api.member

import com.googoo.invitation.domain.Member
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl (
    private val memberRepository: MemberRepository
) : MemberService{

    override fun findById(id:Long): Member?{
        return memberRepository.findById(id).orElseThrow()
    }

    override fun save(member: Member)  {
        memberRepository.save(member)
    }

}