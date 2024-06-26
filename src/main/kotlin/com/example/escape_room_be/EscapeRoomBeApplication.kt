package com.example.escape_room_be

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@EnableJpaAuditing
@SpringBootApplication
class EscapeRoomBeApplication

fun main(args: Array<String>) {
    runApplication<EscapeRoomBeApplication>(*args)
}
