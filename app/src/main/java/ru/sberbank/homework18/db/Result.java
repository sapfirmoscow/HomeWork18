package ru.sberbank.homework18.db;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Result {

    @PrimaryKey
    private int mId;

    private double mResult;

    public Result(double result) {
        mResult = result;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public double getResult() {
        return mResult;
    }

    public void setResult(double result) {
        mResult = result;
    }
}
