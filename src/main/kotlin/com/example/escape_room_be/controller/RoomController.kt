package com.example.escape_room_be.controller

import com.example.escape_room_be.domain.dto.RoomDto
import com.example.escape_room_be.service.RoomService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/room")
class RoomController(
    private val roomService: RoomService
) {
    @GetMapping
    fun getRoomList(): List<RoomDto> = roomService.getRoomList()
}