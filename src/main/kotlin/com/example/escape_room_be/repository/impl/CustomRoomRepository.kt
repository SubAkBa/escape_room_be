package com.example.escape_room_be.repository.impl

import com.example.escape_room_be.domain.Room

interface CustomRoomRepository {
    fun selectRoomList(): List<Room>
}