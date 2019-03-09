package ru.sberbank.homework18;

public class Calculator {

    //private float mResult;
    //private float mNumber;

    public float plus(float a, float b){
        return a + b;
    }

    public float minus(float a, float b){
        return a - b;
    }

    public float multiply(float a, float b){
        return a*b;
    }

    public float devide(float a, float b){
        if (a==0||b==0){
            return devideByZero();
        }
        return a/b;
    }
    private float devideByZero(){
        return Float.NaN;
    }

}
