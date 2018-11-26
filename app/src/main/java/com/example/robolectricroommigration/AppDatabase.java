package com.example.robolectricroommigration;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {
        TodoItem.class,
}, version = 2)
abstract class AppDatabase extends RoomDatabase {
}
