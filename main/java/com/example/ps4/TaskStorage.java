package com.example.ps4;

import java.util.ArrayList;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private final ArrayList<Task> tasks;

    private TaskStorage(){
        this.tasks = new ArrayList<>();
        for(int i=1; i<150; i++){
            this.tasks.add(new Task("Pilne zadanie nr" + i, i % 3 == 0));
        }
    }

    public static TaskStorage getInstance(){
        return taskStorage;
    }

    public ArrayList<Task> getTasks(){
        return tasks;
    }

    public Task getTask(UUID id){
        for(Task task: tasks){
            if(task.getId().compareTo(id) == 0){
                return task;
            }
        }
        return null;
    }
}
