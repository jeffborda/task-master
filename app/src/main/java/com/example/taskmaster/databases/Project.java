package com.example.taskmaster.databases;

import java.util.List;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "project")
public class Project {
    @PrimaryKey(autoGenerate=true)
    public long projectId;
    public long taskId;
    public String title;
    public String description;

    // Default constructor
    public Project() {}
}
