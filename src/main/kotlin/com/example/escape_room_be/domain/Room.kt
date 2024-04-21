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
    @Id
    @Column(name = "room_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var roomNo: Int,

    @Column(name = "room_name")
    var roomName: String,

    @Column(name = "description")
    var description: String,

    @Column(name = "poster")
    var poster: String,

    @Column(name = "level")
    var level: Int,

    @Column(name = "fear")
    var fear: Int,

    @Column(name = "min_personnel")
    var minPersonnel: Int,

    @Column(name = "max_personnel")
    var maxPersonnel: Int,

    @Column(name = "time_limit")
    var timeLimit: Int,
) : BaseEntity()