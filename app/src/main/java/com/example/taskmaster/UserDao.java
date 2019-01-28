package com.example.taskmaster;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {

    @Query("SELECT * FROM user")
    List<User> getAll();

    @Query("SELECT * FROM user WHERE id=:id")
    Project fetchUserById(int id);

    @Insert
    void insertUser(User user);
}
