package ru.levelUp.homework_4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.levelup.qa.at.calculator.Calculator;

public class BaseTest {

    Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        calculator = new Calculator();
    }

    @AfterMethod(alwaysRun = true)
    public void closeCalculator(){
        calculator = null;
    }


}
