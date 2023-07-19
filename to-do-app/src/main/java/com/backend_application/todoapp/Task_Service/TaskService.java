package com.backend_application.todoapp.Task_Service;

import com.backend_application.todoapp.Task_Entity.TaskTable;
import com.backend_application.todoapp.Task_Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    TaskRepository taskRepository;


    public List<TaskTable> getAll() {
        return taskRepository.findAll();
    }

//    public TaskTable getById(long id) {
//        return taskRepository.findById(id);
//    }
}
