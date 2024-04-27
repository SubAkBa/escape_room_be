package com.example.escape_room_be.repository

import com.example.escape_room_be.domain.RoomReserve
import com.example.escape_room_be.repository.impl.CustomRoomReserveRepository
import org.springframework.data.jpa.repository.JpaRepository


interface RoomReserveRepository: JpaRepository<RoomReserve, Int>, CustomRoomReserveRepository {
}