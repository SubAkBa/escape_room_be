package com.example.escape_room_be.repository.impl

import com.example.escape_room_be.domain.QRoomTime.roomTime
import com.example.escape_room_be.domain.RoomTime
import com.querydsl.jpa.impl.JPAQueryFactory

class CustomRoomTimeRepositoryImpl(
    private val jpaQueryFactory: JPAQueryFactory
) : CustomRoomTimeRepository {
    override fun selectRoomTimeListByRoomNo(roomNo: Int): List<RoomTime> {
        return jpaQueryFactory.selectFrom(roomTime)
            .where(roomTime.roomNo.eq(roomNo))
            .fetch()
    }
}