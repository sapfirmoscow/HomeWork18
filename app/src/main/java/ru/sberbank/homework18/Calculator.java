package ru.sberbank.homework18;

public class Calculator {

    public float plus(float a, float b) {
        return a + b;
    }

    //для тестирования приватных методов
    private float privatePlus(float a, float b) {
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float devide(float a, float b) {
        return a / b;
    }


}
