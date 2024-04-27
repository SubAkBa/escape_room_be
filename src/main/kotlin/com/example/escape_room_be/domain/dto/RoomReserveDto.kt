package com.example.escape_room_be.domain.dto

import java.time.LocalDateTime

data class RoomReserveDto(
    var roomReserveNo: Int,
    var reserveTime: LocalDateTime,
    var roomDto: RoomDto,
    var roomTimeDto: RoomTimeDto,
    var reserverName: String,
    var reserverPhoneNumber: String
)
