package com.example.GBSFOtest.rest;


import com.example.GBSFOtest.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskRestController {


    private List<Task> tasks = new ArrayList<>();

    // get all tasks from array
    @GetMapping
    private List<Task> getAll() {
        return tasks;
    }

    // get task by taskId from array
    @GetMapping("/{id}")
    private Object getById(@PathVariable Long id) {
        try {
            for (int i = 0; i <= tasks.size(); i++) {
                if (tasks.get(i).getId().equals(id)) {
                    return tasks.get(i);
                }
            }
        } catch (Exception ex) {
            return "task wasn't found:  " + ex;
        }
        return "task wasn't found";
    }


    //add new task to arrayList
    @PostMapping("/add/{id}/{description}/{isDone}")
    private String addTask(@PathVariable Long id,
                           @PathVariable String description,
                           @PathVariable boolean isDone) {
        try {
            Task task = new Task(id, description, isDone);
            tasks.add(task);
        } catch (Exception ex) {
            return "task wasn't added" + ex;
        }
        return "task was added";
    }


    // change task status by taskId
    @PostMapping("/update/{id}/{isDone}")
    private Object updateTaskById(@PathVariable Long id, @PathVariable boolean isDone) {
        try {
            for (int i = 0; i <= tasks.size(); i++) {
                if (tasks.get(i).getId().equals(id)) {
                    Task newTask = new Task(tasks.get(i).getId(), tasks.get(i).getDescription(), isDone);
                    tasks.remove(i);
                    tasks.add(newTask);
                    return "task was  updated successfully";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return " task wasn't updated:  " + ex;
        }
        return " task wasn't updated";
    }

    // delete task by taskId
    @DeleteMapping("/delete/{id}")
    private Object deleteTaskById(@PathVariable Long id) {
        try {
            for (int i = 0; i <= tasks.size(); i++) {
                if (tasks.get(i).getId().equals(id)) {
                    tasks.remove(i);
                    return "task was  deleted successfully";
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return " task wasn't deleted:  " + ex;
        }
        return " task wasn't deleted";
    }
}
