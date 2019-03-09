package ru.sberbank.homework18;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class CalcTest {

    Calculator calculator;
    private double delta = 0.00000001;

    @Before
   public void initCalc(){
        calculator = new Calculator();
    }

    @Test
    public void plusIsCorrect(){
        assertEquals(calculator.plus(5, 5), 10, delta);
    }

    @Test
    public void minusIsCorrect(){
        assertEquals(calculator.minus(15, 5), 10, delta);
    }

    @Test
    public void mulitplyIsCorrect(){
        assertEquals(calculator.multiply(5, 5), 25, delta);
    }

    @Test
    public void devideIsCorrect(){
        assertEquals(calculator.devide(25, 5), 5, delta);
    }

    @Test
    public void checkNan() {
        assertEquals(calculator.devide(0, 0), Float.NaN, delta);
    }

    @Test
    public void checkDevideByZero() {
        assertEquals(calculator.devide(5, 0), Float.POSITIVE_INFINITY, delta);
        assertEquals(calculator.devide(-5, 0), Float.NEGATIVE_INFINITY, delta);
    }

    @Test
    public void checkPrivatePlusMethod() {
        Class aClass = calculator.getClass();
        try {
            Method method = aClass.getDeclaredMethod("privatePlus");
            method.setAccessible(true);
            float test = (float) method.invoke(aClass.newInstance(), 5, 5);
            assertEquals(test, 10, delta);
            method.setAccessible(false);
        } catch (NoSuchMethodException e) {

        } catch (InstantiationException e) {

        } catch (IllegalAccessException e) {

        } catch (InvocationTargetException e) {

        }
    }


}
