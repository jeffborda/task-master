package com.example.taskmaster;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM task")
    List<Task> getAll();

    @Query("SELECT * FROM task WHERE id=:id")
    Project fetchTaskById(int id);

    @Insert
    void insertTask(Task task);
}
