package org.lessons.java.calculator;

public class Calculator {


    private int num1;
    private int num2;

    public float add(float num1, float num2){

        float risultato = num1 + num2;
        return risultato;

    }


    public float subtract(float num1, float num2){
        float risultato = num1 - num2;
        return risultato;
    }


    public float divide(float num1, float num2){
        float risultato = num1 / num2;
        return risultato;
    }


    public float multiply(float num1, float num2){
        float risultato = num1 * num2;
        return risultato;
    }

}
