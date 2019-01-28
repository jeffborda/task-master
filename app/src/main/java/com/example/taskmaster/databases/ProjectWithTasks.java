package com.example.taskmaster.databases;

import java.util.List;

import androidx.room.Embedded;
import androidx.room.Relation;

public class ProjectWithTasks {

    @Embedded
    public Project project;

    @Relation(parentColumn = "projectId", entityColumn = "userId", entity = Task.class)
    public List<Task> tasks;
}
