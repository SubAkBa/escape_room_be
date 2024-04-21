package com.example.escape_room_be.repository.impl

import com.example.escape_room_be.domain.QRoom.room
import com.example.escape_room_be.domain.Room
import com.querydsl.jpa.impl.JPAQueryFactory

class CustomRoomRepositoryImpl(
    private val jpaQueryFactory: JPAQueryFactory
) : CustomRoomRepository {

    override fun selectRoomList(): List<Room> {
        return jpaQueryFactory.selectFrom(room).fetch();
    }
}