package com.googoo.invitation.domain

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime

@Entity
class Invitation(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val idKey: String,
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    var member: Member,
    var groom: String,
    var bridge: String,
    var weddingDate: LocalDateTime,
    var adrress: String,
    var startDate: LocalDate,
    var endDate: LocalDate,
    var passWord: String,

    var video: String?,
    var mainImg: String?,
    var subImg1: String?,
    var subImg2: String?,
    var subImg3: String?,
    var endImg: String?,

    @Lob
    var paragraph1: String?,
    @Lob
    var paragraph2: String?,
    @Lob
    var paragraph3: String?,
    var endMessage: String?,
) {

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="member_id")
//    lateinit var member: Member

    //@TODO MEMBER까지 넣어줘야 함
    override fun toString(): String { //idKey는 제외 시켜야 함
        return "Invitation(id=$id, groom='$groom', bridge='$bridge', weddingDate=$weddingDate, adrress='$adrress', startDate=$startDate, endDate=$endDate, passWord='$passWord', video=$video, mainImg='$mainImg', subImg1='$subImg1', subImg2='$subImg2', subImg3='$subImg3', endImg='$endImg', paragraph1='$paragraph1', paragraph2='$paragraph2', paragraph3='$paragraph3', endMessage='$endMessage')"
    }


}