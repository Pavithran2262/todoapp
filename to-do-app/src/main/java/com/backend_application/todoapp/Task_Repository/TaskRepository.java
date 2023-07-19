package com.backend_application.todoapp.Task_Repository;

import com.backend_application.todoapp.Task_Entity.TaskTable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskTable, Long> {

}
