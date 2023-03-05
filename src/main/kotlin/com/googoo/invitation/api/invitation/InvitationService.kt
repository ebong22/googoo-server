package com.googoo.invitation.api.invitation

import com.googoo.invitation.domain.Invitation
import com.googoo.invitation.dto.InvitationDto


interface InvitationService {

 fun findById(id: Long): Invitation?
 fun save(invitationDto: InvitationDto): Invitation
}