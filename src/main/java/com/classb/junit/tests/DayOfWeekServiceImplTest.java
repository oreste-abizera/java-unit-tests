package com.classb.junit.tests;

import com.classb.junit.service.DayOfWeekServiceImpl;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DayOfWeekServiceImplTest {

    @Test
    public void test_pass() {
        DayOfWeekServiceImpl dayOfWeek = new DayOfWeekServiceImpl();
        String result = dayOfWeek.getDay(1);
        String expected = "MONDAY";
        assertEquals(result,expected);
    }
    @Test
    public void getDay_invalidTest() {
        DayOfWeekServiceImpl dayOfWeek = new DayOfWeekServiceImpl();
        String result = dayOfWeek.getDay(8);
        String expected = "Invalid";
        assertEquals(result,expected);
    }


}