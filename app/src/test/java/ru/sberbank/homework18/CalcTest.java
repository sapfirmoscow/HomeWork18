package ru.sberbank.homework18;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

    Calculator calculator;

    @Before
   public void initCalc(){
        calculator = new Calculator();
    }

    @Test
    public void plusIsCorrect(){
        assertEquals(calculator.plus(5,5),10,0);
        assertEquals(calculator.plus(255,5),260,0);
        assertEquals(calculator.plus(-5,0),-5,0);
    }

    @Test
    public void minusIsCorrect(){
        assertEquals(calculator.minus(5,5),0,0);
        assertEquals(calculator.minus(255,5),250,0);
        assertEquals(calculator.minus(-5,0),-5,0);
    }

    @Test
    public void mulitplyIsCorrect(){
        assertEquals(calculator.multiply(5,5),25,0);
        assertEquals(calculator.multiply(25,5),125,0);
        assertEquals(calculator.multiply(-5,-5),25,0);
        assertEquals(calculator.multiply(-5,0),0,0);
    }

    @Test
    public void devideIsCorrect(){
        assertEquals(calculator.devide(5,5),1,0);
        assertEquals(calculator.devide(25,5),5,0);
        assertEquals(calculator.devide(-5,-5),1,0);
        assertEquals(calculator.devide(-5,0),Double.NaN,0);
    }


}
