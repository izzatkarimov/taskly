package com.izzatkarimov.taskly.domain.dto;

import com.izzatkarimov.taskly.domain.entities.TaskPriority;
import com.izzatkarimov.taskly.domain.entities.TaskStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record TaskDto(
        UUID id,
        String title,
        String description,
        LocalDateTime dueDate,
        TaskPriority priority,
        TaskStatus status
) {
}
