package com.example.escape_room_be.domain.dto

data class RoomDto(
    var roomName: String,
    var description: String,
    var poster: String,
    var level: String,
    var fear: String,
    var minPersonnel: Int,
    var maxPersonnel: Int,
    var timeLimit: Int
)
