package com.classb.junit.tests;


import com.classb.junit.service.CalculatorService;
import com.classb.junit.service.CalculatorServiceImpl;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

class CalculatorServiceManyElements implements CalculatorService {

    @Override
    public int[] getAll() {
        return new int[] {1,2,4};
    }
}

class CalculatorServiceEmptyElements implements CalculatorService {

    @Override
    public int[] getAll() {
        return new int[] {};
    }

}

class CalculatorServiceOneElements implements CalculatorService {

    @Override
    public int[] getAll() {
        return new int[] {4};
    }

}

public class CalculatorServiceImplStubTest {
    CalculatorServiceImpl calcServiceImpl = new CalculatorServiceImpl();

    @Test
    public void calcSum_manyElement() {

        calcServiceImpl.setCalcService(new CalculatorServiceManyElements());

        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calcSum_emptyList() {
        calcServiceImpl.setCalcService(new CalculatorServiceEmptyElements());
        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void calcSum_oneElement() {
        calcServiceImpl.setCalcService(new CalculatorServiceOneElements());

        int actualResult = calcServiceImpl.calcSumForServiceData();
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }
}
