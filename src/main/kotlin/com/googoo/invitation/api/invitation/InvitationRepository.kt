package com.googoo.invitation.api.invitation

import com.googoo.invitation.domain.Invitation
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface InvitationRepository : JpaRepository<Invitation, Long> {
}