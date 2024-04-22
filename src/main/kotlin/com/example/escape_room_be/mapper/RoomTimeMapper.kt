package com.example.escape_room_be.mapper

import com.example.escape_room_be.domain.RoomTime
import com.example.escape_room_be.domain.dto.RoomTimeDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.NullValueMappingStrategy

@Mapper(
    componentModel = "spring",
    nullValueMappingStrategy = NullValueMappingStrategy.RETURN_NULL
)
interface RoomTimeMapper {
    fun convertToDto(roomTime: RoomTime): RoomTimeDto

    @InheritInverseConfiguration
    fun convertToEntity(roomTimeDto: RoomTimeDto): RoomTime
}