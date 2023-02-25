package com.googoo.invitation.domain

import jakarta.persistence.Embeddable
import java.time.LocalDateTime

@Embeddable
class EntityInfo (
    var createDate: LocalDateTime,
    var updateDate: LocalDateTime?
)