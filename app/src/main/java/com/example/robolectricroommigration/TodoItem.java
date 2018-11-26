package com.example.robolectricroommigration;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "todo_items", primaryKeys = {"list_id", "item_id"})
public class TodoItem {
    @ColumnInfo(name = "list_id")
    private long listId;
    @ColumnInfo(name = "item_id")
    private long itemId;
    private String title;
    private boolean completed;

    public long getListId() {
        return listId;
    }

    public void setListId(long listId) {
        this.listId = listId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
