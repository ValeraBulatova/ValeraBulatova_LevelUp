package ru.levelUp.homework_3;

import org.testng.annotations.Test;
import ru.levelUp.qa.homework_1.task_1.Divide;
import static org.testng.AssertJUnit.assertEquals;

public class TestDevide {

    Divide divide = new Divide();

    @Test
    protected void div (){
        assertEquals(5, divide.divide(40, 8));
        assertEquals(7.8, divide.divide(97.5, 12.5));
        assertEquals(83262362L, divide.divide(5313137843944L, 63812L));
    }

}
