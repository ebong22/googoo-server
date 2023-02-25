package com.googoo.invitation.invitation

import com.googoo.invitation.domain.Invitation
import com.googoo.invitation.domain.Member
import com.googoo.invitation.domain.enum.Bank
import com.googoo.invitation.domain.enum.GiftOrMeal
import com.googoo.invitation.domain.enum.Relation
import mu.KotlinLogging
import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.boot.test.context.SpringBootTest
import java.time.LocalDate
import java.time.LocalDateTime


@SpringBootTest
//@Transactional
internal class InvitationServiceImplTest(
    @Autowired private val invitationService: InvitationService ) {

    private val logger = KotlinLogging.logger {}

    @Test
    fun findById() {
        val findInvitation = invitationService.findById(11)
        logger.debug ("findInvitation = $findInvitation")
    }

    @Test
    fun save() {

        val invitation = Invitation(
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

        val saveInvitation = invitationService.save(invitation)
        logger.debug ("saveInvitation = {}", saveInvitation)

        assertThat(saveInvitation).isEqualTo(invitation)

    }

}