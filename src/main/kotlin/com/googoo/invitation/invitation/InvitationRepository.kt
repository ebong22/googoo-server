package com.googoo.invitation.invitation

import com.googoo.invitation.domain.Invitation
import org.springframework.data.repository.CrudRepository

interface InvitationRepository : CrudRepository<Invitation, Long> {
}