package com.example.taskmaster;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import static com.example.taskmaster.Task.Status.ACCEPTED;
import static com.example.taskmaster.Task.Status.ASSIGNED;
import static com.example.taskmaster.Task.Status.AVAILABLE;
import static com.example.taskmaster.Task.Status.COMPLETED;

public class StatusConverter {

    @TypeConverter
    public static Task.Status toStatus(int statusCode) {
        if(statusCode == AVAILABLE.statusCode) {
            return AVAILABLE;
        }
        else if(statusCode == ASSIGNED.statusCode) {
            return ASSIGNED;
        }
        else if(statusCode == ACCEPTED.statusCode) {
            return ACCEPTED;
        }
        else if(statusCode == COMPLETED.statusCode) {
            return COMPLETED;
        }
        else {
            throw new IllegalArgumentException("Could not recognize Task status.");
        }
    }

}
