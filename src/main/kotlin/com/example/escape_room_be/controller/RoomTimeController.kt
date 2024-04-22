package com.example.escape_room_be.controller

import com.example.escape_room_be.domain.dto.RoomTimeDto
import com.example.escape_room_be.service.RoomTimeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/room-time")
class RoomTimeController(
    private val roomTimeService: RoomTimeService
) {
    @GetMapping("/{roomNo}")
    fun getRoomTimeListByRoomNo(@PathVariable roomNo: Int): List<RoomTimeDto> = roomTimeService.getRoomTimeListByRoomNo(roomNo)
}