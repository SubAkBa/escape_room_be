package com.example.escape_room_be.domain.dto

data class RoomDto(
    val roomName: String,
    val description: String,
    val poster: String,
    val level: String,
    val fear: String,
    val personnel: String,
    val timeLimit: Int
)
