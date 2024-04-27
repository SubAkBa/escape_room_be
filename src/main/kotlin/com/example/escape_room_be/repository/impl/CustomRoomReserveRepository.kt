package com.example.escape_room_be.repository.impl

import com.example.escape_room_be.domain.RoomReserve

interface CustomRoomReserveRepository {
    fun selectRoomReserveList(): List<RoomReserve>

    fun selectRoomReserveByRoomReserveNo(roomReserveNo: Int): RoomReserve?
}