package com.example.taskmaster.models;

import java.util.Map;

public class Project {

    public String id;
    public String title;
    public String description;
    public Map<String, Boolean> tasks;

    // Default constructor
    public Project() {}

    public Project(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }


    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Boolean> getTasks() {
        return tasks;
    }
}
