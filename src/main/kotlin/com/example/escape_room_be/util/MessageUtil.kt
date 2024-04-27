package com.example.escape_room_be.util

import org.springframework.context.MessageSource
import org.springframework.context.i18n.LocaleContextHolder
import org.springframework.stereotype.Component

@Component
class MessageUtil(
    private val messageSource: MessageSource
) {

    fun getMessage(messageKey: String): String {
        return messageSource.getMessage(messageKey, null, LocaleContextHolder.getLocale())
    }
}