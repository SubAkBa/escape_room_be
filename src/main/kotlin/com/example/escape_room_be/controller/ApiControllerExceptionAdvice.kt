package com.example.escape_room_be.controller

import com.example.escape_room_be.common.CommonException
import com.example.escape_room_be.domain.ErrorResponse
import com.example.escape_room_be.util.MessageUtil
import org.apache.coyote.BadRequestException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ApiControllerExceptionAdvice(
    private val messageUtil: MessageUtil
) {
    @ExceptionHandler(value = [BadRequestException::class])
    fun handleBadRequestException(exception: CommonException): ResponseEntity<ErrorResponse> {
        val errorResponse = ErrorResponse(
            exception.statusCode,
            messageUtil.getMessage(exception.messageKey),
            exception.stackTraceToString()
        )

        return ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST)
    }
}