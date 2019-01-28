package com.example.taskmaster.databases;

import java.util.List;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "project")
public class Project {
    @PrimaryKey(autoGenerate=true)
    public Long id;
    public String title;
    public String description;
    public List<Task> tasks;
    public User user;

    // Default constructor
    public Project() {}
}
