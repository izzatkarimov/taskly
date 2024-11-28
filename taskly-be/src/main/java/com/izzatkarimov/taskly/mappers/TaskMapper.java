package com.izzatkarimov.taskly.mappers;

import com.izzatkarimov.taskly.domain.dto.TaskDto;
import com.izzatkarimov.taskly.domain.entities.Task;

public interface TaskMapper {

    Task fromDto(TaskDto taskDto);
    TaskDto toDto(Task task);

}
