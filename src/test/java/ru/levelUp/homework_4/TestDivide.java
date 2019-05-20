package ru.levelUp.homework_4;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestDivide extends BaseTest{

    @Test
    public void divDouble (){
        assertEquals(7.8, calculator.div(97.5, 12.5));
    }
    @Test
    public void divLong(){
        assertEquals(83262362L, calculator.div(5313137843944L, 63812L));
    }
}
