package com.googoo.invitation.api.invitation

import com.googoo.invitation.InvitationUtils
import com.googoo.invitation.api.member.MemberRepository
import com.googoo.invitation.domain.Invitation
import com.googoo.invitation.domain.Member
import com.googoo.invitation.dto.InvitationDto
import mu.KotlinLogging
import org.springframework.stereotype.Service

@Service
class InvitationServiceImpl (
        private val invitationRepository: InvitationRepository
        , private val memberRepository: MemberRepository
) : InvitationService {

    private val logger = KotlinLogging.logger {}
    override fun findById(id: Long): Invitation? {
        return invitationRepository.findById(id).orElseThrow()
    }

    override fun save(invitationDto: InvitationDto): Invitation {
        val member = memberRepository.findByIdKey(invitationDto.memberIdKey)
        logger.debug("member={}", member)
        val invitation = invitationDtoToInvitation(invitationDto, member)
        return invitationRepository.save(invitation)
    }

    // model mapper 라이브럴 ㅣ찾아보기
    private fun invitationDtoToInvitation(invitationDto: InvitationDto, member: Member): Invitation {
        return Invitation(
            idKey = InvitationUtils.makeIdKey() // hash 생성해서 삽입
            , member = member
            , groom = invitationDto.groom
            , bridge =  invitationDto.bridge
            , weddingDate = invitationDto.weddingDate
            , adrress =  invitationDto.adrress
            , startDate = invitationDto.startDate
            , endDate =  invitationDto.endDate
            , passWord =  invitationDto.passWord
            , video =  invitationDto.video
            , mainImg =  invitationDto.mainImg
            , subImg1 =  invitationDto.subImg1
            , subImg2 =  invitationDto.subImg2
            , subImg3 =  invitationDto.subImg3
            , endImg = invitationDto.endImg
            , paragraph1 = invitationDto.paragraph1
            , paragraph2 = invitationDto.paragraph2
            , paragraph3 = invitationDto.paragraph3
            , endMessage = invitationDto.endMessage
        )
    }

}