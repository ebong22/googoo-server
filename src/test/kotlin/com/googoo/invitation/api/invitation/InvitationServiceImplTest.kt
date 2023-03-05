package com.googoo.invitation.api.invitation

import com.googoo.invitation.InvitationUtils
import com.googoo.invitation.api.invitation.InvitationService
import com.googoo.invitation.api.member.MemberService
import com.googoo.invitation.domain.Invitation
import com.googoo.invitation.domain.Member
import com.googoo.invitation.domain.enum.Bank
import com.googoo.invitation.domain.enum.GiftOrMeal
import com.googoo.invitation.domain.enum.Relation
import com.googoo.invitation.dto.InvitationDto
import mu.KotlinLogging
import net.bytebuddy.utility.RandomString
import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*


@SpringBootTest
//@Transactional
internal class InvitationServiceImplTest(
    @Autowired private val invitationService: InvitationService
    , @Autowired private val memberService: MemberService
) {

    private val logger = KotlinLogging.logger {}

    @Test
    fun findById() {
        val findInvitation = invitationService.findById(1)
        logger.debug ("findInvitation = $findInvitation")
    }

    @Test
    fun save() {
        val member = mockMember()
        memberService.save(member)

        val invitationDto = mockInvitationDto(member.idKey)
        val saveInvitation = invitationService.save(invitationDto)
        logger.debug ("saveInvitation = {}", saveInvitation)

        assertThat(saveInvitation.member.idKey).isEqualTo(invitationDto.memberIdKey)
        assertThat(saveInvitation.bridge).isEqualTo(invitationDto.bridge)
    }

    private fun mockInvitationDto(memberIdKey: String): InvitationDto{
        return InvitationDto(
            memberIdKey = memberIdKey,
            groom = "test",
            bridge = "test",
            weddingDate = LocalDateTime.now(),
            adrress = "test",
            startDate = LocalDate.now(),
            endDate = LocalDate.now(),
            passWord = "test",
            video = null,
            mainImg = "test",
            subImg1 = "teset",
            subImg2 = "test",
            subImg3 = "test",
            endImg = "test",
            paragraph1 = "test",
            paragraph2 = "test",
            paragraph3 = "test",
            endMessage = "test"
        )
    }

    private fun mockMember(): Member{
        return Member(
            idKey = InvitationUtils.makeIdKey(),
            name = "김테스트",
            tel = "01012345678",
            mail = "123@abc.com",
            etc = null,
            extraDays = 1,
            isQuickRequest = false
        )
    }


}