package com.example.demo.service;

import com.example.demo.model.Application;
import com.example.demo.model.Employee;
import com.example.demo.model.Task;

import java.util.List;

public interface TaskService {

    List<Task> getAllTasks();

    Task createTask(Task task);
}
