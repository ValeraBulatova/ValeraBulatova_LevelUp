package ru.levelUp.homework_3;

import org.testng.annotations.Test;
import ru.levelUp.qa.homework_1.task_1.Multiple;
import static org.testng.AssertJUnit.assertEquals;

public class TestMultiple {

    Multiple mult = new Multiple();

    @Test
    protected void mult (){
        assertEquals(-18, mult.mult(-3, 6));
        assertEquals(34.83, mult.mult(8.1, 4.3));
        assertEquals(3684375724063504L, mult.mult(5892625252L, 625252L));
    }


}
