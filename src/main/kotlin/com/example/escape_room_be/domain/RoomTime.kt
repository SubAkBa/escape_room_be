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
    roomNo: Int,
    time: String
) : BaseEntity() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_time_no")
    var roomTimeNo: Int = 0

    @Column(name = "room_no")
    var roomNo: Int = roomNo

    @Column(name = "time")
    var time: String = time

    @OneToMany(mappedBy = "roomTime")
    var roomReserveList: MutableList<RoomReserve> = ArrayList()
}