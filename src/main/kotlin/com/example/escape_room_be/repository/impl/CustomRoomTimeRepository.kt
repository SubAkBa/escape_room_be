package com.example.escape_room_be.repository.impl

import com.example.escape_room_be.domain.RoomTime

interface CustomRoomTimeRepository {
    fun selectRoomTimeListByRoomNo(roomNo: Int): List<RoomTime>
}