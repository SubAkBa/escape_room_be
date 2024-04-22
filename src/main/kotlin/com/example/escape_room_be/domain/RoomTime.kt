package com.example.escape_room_be.domain

import jakarta.persistence.*
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor

@Builder
@Entity
@Getter
@NoArgsConstructor
class RoomTime(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_time_no")
    val roomTimeNo: Int,

    @Column(name = "room_no")
    val roomNo: Int,

    @Column(name = "time")
    val time: String
) : BaseEntity()