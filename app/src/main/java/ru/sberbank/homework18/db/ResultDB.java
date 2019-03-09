package ru.sberbank.homework18.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = Result.class, version = 1)
public abstract class ResultDB extends RoomDatabase {
    public abstract ResultDAO getResultDao();
}
