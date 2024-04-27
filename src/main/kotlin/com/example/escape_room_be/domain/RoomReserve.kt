package com.example.escape_room_be.domain

import jakarta.persistence.*
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor
import java.time.LocalDateTime

@Builder
@Getter
@Entity
@NoArgsConstructor
class RoomReserve(
    reserveDate: LocalDateTime,
    reserverName: String,
    reserverPhoneNumber: String
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_reserve_no")
    var roomReserveNo: Int = 0

    @Column(name = "reserve_date")
    var reserveDate: LocalDateTime = reserveDate

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_no")
    lateinit var room: Room

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_time_no")
    lateinit var roomTime: RoomTime

    @Column(name = "reserver_name")
    var reserverName: String = reserverName

    @Column(name = "reserver_phone_number")
    var reserverPhoneNumber: String = reserverPhoneNumber
}