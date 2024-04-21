package com.example.escape_room_be.repository

import com.example.escape_room_be.domain.Room
import com.example.escape_room_be.repository.impl.CustomRoomRepository
import org.springframework.data.jpa.repository.JpaRepository

interface RoomRepository : JpaRepository<Room, Int>, CustomRoomRepository {
}