package com.googoo.invitation.api.invitation

import com.googoo.invitation.InvitationUtils
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

    /**
     * @TODO 관리자 페이지 만들 때
     *  1. 회원정보입력 -> 정보 등록 및 청첩장만들기 or 청첩창 만들기.. 무튼 회원정보 입력 후 저장같은 버튼 우선 -> member.save
     *  2. 청첩장 정보 입력 후 저장 -> invitation.save
     */
    @GetMapping("/save")
    fun save(@RequestBody invitationDto: InvitationDto ): String {
        // @TODO MemeberId를 통해 Member 조회 -> member 없으면 exception 있으면 saveInvitation에 넣어주기
        // 찾은 memeber 넣어주기
//        saveInvitation.member = findMember
//        invitationService.save(saveInvitation)
        // @TODO return 형식 만들어서 return
        return "ok"
    }



}