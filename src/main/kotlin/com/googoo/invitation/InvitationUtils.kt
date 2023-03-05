package com.googoo.invitation

import java.util.UUID

class InvitationUtils {
    companion object{
        fun makeIdKey(): String {
            return UUID.randomUUID().toString();
        }
    }
}