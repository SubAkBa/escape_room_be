package com.example.escape_room_be.controller

import com.example.escape_room_be.domain.dto.RoomReserveDto
import com.example.escape_room_be.service.RoomReserveService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
class RoomReserveController(
    private val roomReserveService: RoomReserveService
) {

    @GetMapping
    fun getRoomReserveList(): List<RoomReserveDto> {
        return roomReserveService.getRoomReserveList()
    }

    @GetMapping("/{roomReserveNo}")
    fun getRoomReserve(@PathVariable roomReserveNo: Int): RoomReserveDto {
        return roomReserveService.getRoomReserveByRoomReserveNo(roomReserveNo)
    }
}