package com.googoo.invitation.invitation

import com.googoo.invitation.domain.Invitation
import org.springframework.stereotype.Service

@Service
class InvitationServiceImpl (
        private val invitationRepository: InvitationRepository ) : InvitationService {

            override fun findById(id: Long): Invitation? {
                return invitationRepository.findById(id).orElseThrow()
            }

            override fun save(invitation: Invitation): Invitation {
                return invitationRepository.save(invitation)
            }

}