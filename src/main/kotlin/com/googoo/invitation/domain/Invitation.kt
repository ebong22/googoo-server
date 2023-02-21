package com.googoo.invitation.domain

import jakarta.persistence.*
import org.jetbrains.annotations.NotNull
import org.springframework.data.convert.Jsr310Converters.LocalDateToDateConverter
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
class Invitation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="board_id")
    var member: Member,

    var groom: String,
    var bridge: String,
    var weddingDate: LocalDateTime,
    var adrress: String,

    var startDate: LocalDate,
    var endDate: LocalDate,
    var passWord: String,

    var video: String,
    var mainImg: String,
    var subImg1: String,
    var subImg2: String,
    var subImg3: String,
    var endImg: String,

    @Lob
    var paragraph1: String,
    @Lob
    var paragraph2: String,
    @Lob
    var paragraph3: String,
    var endMessage: String,
)