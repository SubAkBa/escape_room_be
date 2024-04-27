package com.example.escape_room_be.domain

import jakarta.persistence.*
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor

@Builder
@Getter
@Entity
@NoArgsConstructor
class Room(
    roomName: String,
    description: String,
    poster: String,
    level: Int,
    fear: Int,
    minPersonnel: Int,
    maxPersonnel: Int,
    timeLimit: Int
) : BaseEntity() {
    @Id
    @Column(name = "room_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var roomNo: Int = 0

    @Column(name = "room_name")
    var roomName: String = roomName

    @Column(name = "description")
    var description: String = description

    @Column(name = "poster")
    var poster: String = poster

    @Column(name = "level")
    var level: Int = level

    @Column(name = "fear")
    var fear: Int = fear

    @Column(name = "min_personnel")
    var minPersonnel: Int = minPersonnel

    @Column(name = "max_personnel")
    var maxPersonnel: Int = maxPersonnel

    @Column(name = "time_limit")
    var timeLimit: Int = timeLimit

    @OneToMany(mappedBy = "roomTime")
    var roomTimeList: MutableList<RoomTime> = ArrayList();
}