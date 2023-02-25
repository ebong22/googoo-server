package com.googoo.invitation.invitation

import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class InvitationController {

    @GetMapping()
    fun test(model: Model): String {
        model["title"] = "blog"
        return "blog"
    }
}