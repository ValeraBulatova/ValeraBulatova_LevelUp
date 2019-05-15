package ru.levelUp.homework_4;


import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

// TODO А где класс BaseTest
public class TestSum extends BaseTest{


    @Test
    public void sumDouble (){
        assertEquals(7.9, calculator.sum(2.1, 5.8));
    }

    @Test
    public void sumLong(){
        assertEquals(767682168754653L, calculator.sum(53637516141L, 767628531238512L));
    }
}
