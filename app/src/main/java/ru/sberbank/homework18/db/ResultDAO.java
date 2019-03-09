package ru.sberbank.homework18.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

@Dao
public interface ResultDAO {

    @Query("SELECT * FROM Result")
    Result getResult();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insert(Result result);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    int update(Result result);
}
