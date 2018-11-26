package com.example.robolectricroommigration;

import androidx.annotation.NonNull;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

class MigrationTo2 extends Migration {
    MigrationTo2() {
        super(1, 2);
    }

    @Override
    public void migrate(@NonNull SupportSQLiteDatabase database) {
        database.execSQL("alter table todo_items add column title text default null");
        database.execSQL("alter table todo_items add column completed integer not null default 0");
    }
}
