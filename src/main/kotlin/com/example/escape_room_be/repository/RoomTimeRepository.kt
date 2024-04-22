package com.example.escape_room_be.repository

import com.example.escape_room_be.domain.RoomTime
import com.example.escape_room_be.repository.impl.CustomRoomTimeRepository
import org.springframework.data.jpa.repository.JpaRepository

interface RoomTimeRepository : JpaRepository<RoomTime, Int>, CustomRoomTimeRepository {
}