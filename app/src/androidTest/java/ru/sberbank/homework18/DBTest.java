package ru.sberbank.homework18;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.sberbank.homework18.db.Result;
import ru.sberbank.homework18.db.ResultDAO;
import ru.sberbank.homework18.db.ResultDB;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class DBTest {

    private ResultDB resultDB;
    private ResultDAO resultDAO;
    private double delta = 0.1;

    @Before
    public void createDB() {
        Context context = InstrumentationRegistry.getContext();
        resultDB = Room.inMemoryDatabaseBuilder(context, ResultDB.class).build();
        resultDAO = resultDB.getResultDao();
    }

    @Test
    public void writeAndReadTest() {
        Calculator calculator = new Calculator();
        float temp = calculator.multiply(5, 5);

        Result result = new Result(temp);

        if (resultDAO.getResult() == null) {
            resultDAO.insert(result);
        } else {
            resultDAO.update(result);
        }
        assertEquals(temp, resultDAO.getResult().getResult(), delta);
    }


    @After
    public void closeDB() {
        resultDB.close();
    }
}
