package com.example.escape_room_be.service

import com.example.escape_room_be.common.CommonException
import com.example.escape_room_be.domain.RoomReserve
import com.example.escape_room_be.domain.dto.RoomReserveDto
import com.example.escape_room_be.mapper.RoomMapper
import com.example.escape_room_be.mapper.RoomReserveMapper
import com.example.escape_room_be.mapper.RoomTimeMapper
import com.example.escape_room_be.repository.RoomReserveRepository
import lombok.RequiredArgsConstructor
import org.apache.commons.lang3.ObjectUtils
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class RoomReserveService(
    private val roomReserveRepository: RoomReserveRepository,
    private val roomMapper: RoomMapper,
    private val roomTimeMapper: RoomTimeMapper,
    private val roomReserveMapper: RoomReserveMapper,
) {

    fun getRoomReserveList(): List<RoomReserveDto> {
        val selectRoomReserveList: List<RoomReserve> = roomReserveRepository.selectRoomReserveList()

        return selectRoomReserveList
            .map {
                var convertToDto: RoomReserveDto = roomReserveMapper.convertToDto(it)

                convertToDto.roomDto = roomMapper.convertToDto(it.room)
                convertToDto.roomTimeDto = roomTimeMapper.convertToDto(it.roomTime)

                convertToDto

                convertToDto
            }
            .toList()
    }

    fun getRoomReserveByRoomReserveNo(roomReserveNo: Int): RoomReserveDto {
        val roomReserve: RoomReserve? = roomReserveRepository.selectRoomReserveByRoomReserveNo(roomReserveNo)

        if (ObjectUtils.isEmpty(roomReserve)) {
            throw CommonException(HttpStatus.BAD_REQUEST.reasonPhrase, "room.reserve.not.exist")
        }

        return roomReserveMapper.convertToDto(roomReserve!!)
    }
}