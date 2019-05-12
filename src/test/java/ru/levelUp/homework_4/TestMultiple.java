package ru.levelUp.homework_4;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestMultiple extends BaseTest{

    @Test
    public void multDouble (){
        assertEquals(34.0, calculator.mult(8.1, 4.3));
    }

    @Test
    public void multLong(){
        assertEquals(3684375724063504L, calculator.mult(5892625252L, 625252L));
    }


}
