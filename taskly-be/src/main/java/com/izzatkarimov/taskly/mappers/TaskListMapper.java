package com.izzatkarimov.taskly.mappers;

import com.izzatkarimov.taskly.domain.dto.TaskListDto;
import com.izzatkarimov.taskly.domain.entities.TaskList;

public interface TaskListMapper {

    TaskList fromDto(TaskListDto taskListDto);

    TaskListDto toDto(TaskList taskList);

}
