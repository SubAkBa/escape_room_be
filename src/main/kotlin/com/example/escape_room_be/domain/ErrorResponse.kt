package com.example.escape_room_be.domain

data class ErrorResponse(
    var statusCode: String,
    var message: String,
    var detail: String
)