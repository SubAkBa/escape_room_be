package com.example.escape_room_be.service

import com.example.escape_room_be.domain.dto.RoomTimeDto
import com.example.escape_room_be.mapper.RoomTimeMapper
import com.example.escape_room_be.repository.RoomTimeRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class RoomTimeService(
    private val roomTimeRepository: RoomTimeRepository,
    private val roomTimeMapper: RoomTimeMapper
) {
//    @Transactional(readOnly = true)
//    fun getAllRoomTimeList(): RoomTimeDto {
//        roomBookDateRepository.findAll();
//    }

    @Transactional(readOnly = true)
    fun getRoomTimeListByRoomNo(roomNo: Int): List<RoomTimeDto> {
        val roomTimeListByRoomNo = roomTimeRepository.selectRoomTimeListByRoomNo(roomNo)

        return roomTimeListByRoomNo
            .map { roomTimeMapper.convertToDto(it) }
            .toList()
    }
}