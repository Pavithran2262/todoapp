package com.backend_application.todoapp.Task_Controller;

import com.backend_application.todoapp.Task_Entity.TaskTable;
import com.backend_application.todoapp.Task_Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo/task")
public class TaskDetailController {

    @Autowired
    TaskService taskService;
    @GetMapping(value = "/getall")
    public List<TaskTable> getAll(){
        return taskService.getAll();
    }
    @GetMapping(value = "/get/{id}")
    public TaskTable getById(@PathVariable("id") long id){
        return taskService.getById(id);
    }

}
