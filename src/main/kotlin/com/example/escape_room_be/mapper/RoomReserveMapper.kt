package com.example.escape_room_be.mapper

import com.example.escape_room_be.domain.RoomReserve
import com.example.escape_room_be.domain.dto.RoomReserveDto
import org.mapstruct.InheritInverseConfiguration
import org.mapstruct.Mapper
import org.mapstruct.NullValueMappingStrategy

@Mapper(
    componentModel = "spring",
    nullValueMapMappingStrategy = NullValueMappingStrategy.RETURN_NULL
)
interface RoomReserveMapper {

    fun convertToDto(roomReserve: RoomReserve): RoomReserveDto

    @InheritInverseConfiguration
    fun convertToEntity(roomReserveDto: RoomReserveDto): RoomReserve
}