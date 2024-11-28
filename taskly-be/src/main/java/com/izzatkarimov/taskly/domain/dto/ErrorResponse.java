package com.izzatkarimov.taskly.domain.dto;

public record ErrorResponse(
        int status,
        String messages,
        String details
) {
}
