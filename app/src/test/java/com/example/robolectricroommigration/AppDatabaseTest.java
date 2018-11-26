package com.example.robolectricroommigration;

import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.room.testing.MigrationTestHelper;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;

@RunWith(AndroidJUnit4.class)
public class AppDatabaseTest {

    @Test
    public void migration() throws Exception {
        System.setProperty("robolectric.logging.enabled", "true");
        MigrationTestHelper helper = new MigrationTestHelper(InstrumentationRegistry.getInstrumentation(), AppDatabase.class.getName());
        try (SupportSQLiteDatabase db = helper.createDatabase("test", 1)) {
        }
        try (SupportSQLiteDatabase db = helper.runMigrationsAndValidate("test", 2, true, new MigrationTo2())) {
        }
    }
}
