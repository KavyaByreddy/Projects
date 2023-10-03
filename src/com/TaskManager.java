package com;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String taskName) {
        Task task = new Task(taskName);
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    // Implement methods to list tasks and mark tasks as done
}
