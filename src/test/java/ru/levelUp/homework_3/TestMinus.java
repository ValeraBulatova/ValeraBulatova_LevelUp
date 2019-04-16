package ru.levelUp.homework_3;

import org.testng.annotations.Test;
import ru.levelUp.qa.homework_1.task_1.Subtraction;
import static org.testng.AssertJUnit.assertEquals;

public class TestMinus {

    private Subtraction minus = new Subtraction();

    @Test
    protected void minus(){
        assertEquals(-5, minus.minus(1, -6));
        assertEquals(23.7, minus.minus(15.3, -8.4));
        assertEquals(-697977897957L, minus.minus(88784888265L, 786762786222L));
    }

}
