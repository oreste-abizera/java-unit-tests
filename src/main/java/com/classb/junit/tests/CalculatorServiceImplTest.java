package com.classb.junit.tests;

import com.classb.junit.service.CalculatorServiceImpl;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorServiceImplTest {
    @Test
    public void calcSum_manyElement() {
        CalculatorServiceImpl calcServiceImpl = new CalculatorServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {1,2,-3});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calcSum_emptyList() {
        CalculatorServiceImpl calcServiceImpl = new CalculatorServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calcSum_oneElement() {
        CalculatorServiceImpl calcServiceImpl = new CalculatorServiceImpl();

        int actualResult = calcServiceImpl.calcSum(new int[] {4});
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }
}
