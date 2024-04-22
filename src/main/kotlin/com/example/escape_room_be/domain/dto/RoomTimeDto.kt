package com.example.escape_room_be.domain.dto

data class RoomTimeDto(
    val roomTimeNo: Int,
    val roomNo: Int,
    val time: String
)