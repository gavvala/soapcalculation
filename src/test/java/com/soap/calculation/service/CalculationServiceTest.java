package com.soap.calculation.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationServiceTest {

    private CalculationService service = new CalculationService();

    @Test
    public void add() {
        int value = service.add(1,2);
        assertEquals(3, value);
    }

    @Test
    public void divide() {
        int value = service.divide(10,2);
        assertEquals(5, value);
    }

    @Test
    public void multiply() {
        int value = service.multiply(2,2);
        assertEquals(4, value);
    }

    @Test
    public void subtract() {
        int value = service.subtract(10,2);
        assertEquals(8, value);
    }
}