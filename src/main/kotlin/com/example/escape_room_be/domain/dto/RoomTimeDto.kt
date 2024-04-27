package com.example.escape_room_be.domain.dto

data class RoomTimeDto(
    var roomTimeNo: Int,
    var roomNo: Int,
    var time: String
)