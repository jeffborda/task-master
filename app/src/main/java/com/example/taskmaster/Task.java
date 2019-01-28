package com.example.taskmaster;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

@Entity(tableName = "task")
public class Task {
    @PrimaryKey(autoGenerate = true)
    public Long id;
    public String title;
    @TypeConverters(StatusConverter.class)
    public Status status;
    public Project project;

    // Default constructor
    public Task() {}


    @TypeConverters(StatusConverter.class)
    public enum Status {
        AVAILABLE(0),
        ASSIGNED(1),
        ACCEPTED(2),
        COMPLETED(3);

        public int statusCode;

        Status(int statusCode) {
            this.statusCode = statusCode;
        }
    }


}
