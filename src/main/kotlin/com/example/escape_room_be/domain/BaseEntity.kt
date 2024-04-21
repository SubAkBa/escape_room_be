package com.example.escape_room_be.domain

import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity(
    @CreatedDate var reg_time: LocalDateTime = LocalDateTime.now(),
    @CreatedBy var register: String? = null,
    @LastModifiedDate var mod_time: LocalDateTime = LocalDateTime.now(),
    @LastModifiedBy var modifier: String? = null
)