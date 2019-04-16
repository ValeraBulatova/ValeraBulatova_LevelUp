package ru.levelUp.homework_3;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.levelUp.qa.homework_1.task_1.CalculatorApp;
import ru.levelUp.qa.homework_1.task_1.ChooseAction;
import ru.levelUp.qa.homework_1.task_1.Sum;

import java.io.IOException;

import static org.testng.AssertJUnit.assertEquals;

public class TestSum {

    private Sum sum = new Sum();

    @Test
    protected void sum (){
            assertEquals(7, sum.sum(3, 4));
            assertEquals(7.9, sum.sum(2.1, 5.8));
            assertEquals(767682168754653L, sum.sum(53637516141L, 767628531238512L));

    }
}
