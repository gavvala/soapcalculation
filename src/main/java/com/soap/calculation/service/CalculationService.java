package com.soap.calculation.service;

import com.soap.calculation.Calculator;

public class CalculationService {

    private Calculator calculator = new Calculator();

    public int add(int a, int b) {
        return calculator.getCalculatorSoap().add(a,b);
    }

    public int subtract(int a, int b) {
        return calculator.getCalculatorSoap().subtract(a,b);
    }

    public int divide(int a, int b) {
        return calculator.getCalculatorSoap().divide(a,b);
    }

    public int multiply(int a, int b) {
        return calculator.getCalculatorSoap().multiply(a,b);
    }

}
