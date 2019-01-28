package com.example.taskmaster;

import java.util.List;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class User {
    @PrimaryKey(autoGenerate = true)
    Long id;
    String firstName;
    String lastName;
    String username;
    String password;
    List<Project> projects;

    // Default constructor
    public User() {}
}
