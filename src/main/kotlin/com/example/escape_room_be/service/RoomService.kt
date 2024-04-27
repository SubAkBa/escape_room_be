package com.example.escape_room_be.service

import com.example.escape_room_be.domain.Room
import com.example.escape_room_be.domain.dto.RoomDto
import com.example.escape_room_be.mapper.RoomMapper
import com.example.escape_room_be.repository.RoomRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class RoomService(
    private val roomRepository: RoomRepository,
    private val roomMapper: RoomMapper
) {
    @Transactional(readOnly = true)
    fun getRoomList(): List<RoomDto> {
        val roomList: List<Room> = roomRepository.selectRoomList()

        return roomList
            .map { roomMapper.convertToDto(it) }
            .toList()
    }
}