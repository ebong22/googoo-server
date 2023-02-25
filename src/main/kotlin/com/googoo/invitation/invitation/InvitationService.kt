package com.googoo.invitation.invitation

import com.googoo.invitation.domain.Invitation


interface InvitationService {

 fun findById(id: Long): Invitation?
 fun save(invitation: Invitation): Invitation
}