package com.example.escape_room_be.repository.impl

import com.example.escape_room_be.domain.QRoom.*
import com.example.escape_room_be.domain.QRoomReserve.*
import com.example.escape_room_be.domain.QRoomTime.roomTime
import com.example.escape_room_be.domain.RoomReserve
import com.querydsl.jpa.impl.JPAQueryFactory

class CustomRoomReserveRepositoryImpl(
    private val jpaQueryFactory: JPAQueryFactory
) : CustomRoomReserveRepository {

    override fun selectRoomReserveList(): List<RoomReserve> {
        return jpaQueryFactory
            .selectFrom(roomReserve)
            .join(roomReserve.room, room).fetchJoin()
            .join(roomReserve.roomTime, roomTime).fetchJoin()
            .fetch()
    }

    override fun selectRoomReserveByRoomReserveNo(roomReserveNo: Int): RoomReserve? {
        return jpaQueryFactory
            .selectFrom(roomReserve)
            .join(roomReserve.room, room).fetchJoin()
            .join(roomReserve.roomTime, roomTime).fetchJoin()
            .where(roomReserve.roomReserveNo.eq(roomReserveNo))
            .fetchOne()
    }
}