package com.googoo.invitation.dto

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Lob
import java.time.LocalDate
import java.time.LocalDateTime

data class InvitationDto (

    val memberId: String,
    val groom: String,
    val bridge: String,
    val weddingDate: LocalDateTime,
    val adrress: String,
    val startDate: LocalDate,
    val endDate: LocalDate,
    val passWord: String,

    val video: String?,
    val mainImg: String?,
    val subImg1: String?,
    val subImg2: String?,
    val subImg3: String?,
    val endImg: String?,

    val paragraph1: String?,
    val paragraph2: String?,
    val paragraph3: String?,
    val endMessage: String?,
        )