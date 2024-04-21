package com.example.escape_room_be.mapper

import com.example.escape_room_be.domain.Room
import com.example.escape_room_be.domain.dto.RoomDto
import org.mapstruct.*

@Mapper(
    componentModel = "spring",
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL
)
interface RoomMapper {
    fun convertToDto(room: Room): RoomDto

    @InheritInverseConfiguration
    fun convertToEntity(roomDto: RoomDto): Room
}