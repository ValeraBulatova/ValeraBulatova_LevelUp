package ru.levelUp.homework_4;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

// TODO А где класс BaseTest
public class TestMinus extends BaseTest{

    @Test
    public void minusDouble(){
        assertEquals(23.4, calculator.sub(15, -8.4));
    }
    @Test
    public void minusLong(){
        assertEquals(-697977897957L, calculator.sub(88784888265L, 786762786222L));
    }

}
