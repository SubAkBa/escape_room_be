package com.example.escape_room_be.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity

@Configuration
class WebConfig {
    @Bean
    fun filterChain(http: HttpSecurity) = http
        .csrf { it.disable() }
        .authorizeHttpRequests { it.requestMatchers("**").permitAll() }
        .build()!!
}