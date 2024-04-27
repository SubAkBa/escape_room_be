package com.example.escape_room_be.common

import lombok.Getter
import java.lang.RuntimeException

@Getter
class CommonException(
    var statusCode: String,
    var messageKey: String
) : RuntimeException() {
}