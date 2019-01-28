package com.example.taskmaster.databases;

import androidx.room.Database;

@Database(version = 1, entities = {Task.class})
public abstract class TaskDatabase {
    public abstract TaskDao taskDao();
}
