package com.googoo.invitation.invitation

import com.googoo.invitation.domain.Invitation
import com.googoo.invitation.dto.InvitationDto
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class InvitationController (
    private val invitationService: InvitationService
        ) {

    @GetMapping("/save")
    fun save(@RequestBody invitationDto: InvitationDto ): String {
        // @TODO MemeberId를 통해 Member 조회 -> member 없으면 exception 있으면 saveInvitation에 넣어주기
        val saveInvitation = invitationDtoToInvitation(invitationDto)
        // 찾은 memeber 넣어주기
//        saveInvitation.member = findMember
        invitationService.save(saveInvitation)
        // @TODO return 형식 만들어서 return
        return "ok"
    }

    // model mapper 라이브럴 ㅣ찾아보기
    fun invitationDtoToInvitation(invitationDto: InvitationDto ): Invitation {
        return Invitation(
            idKey = "" // hash 생성해서 삽입
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