package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionWithParametrizedTest {

    private final String sex;
    private final boolean hasMane;

    public LionWithParametrizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.hasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[] getSexAndExpectedManeData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}, // передали тестовые данные
        };
    }

    @Test
    public void doesHaveManeCheckResultPositiveTest() {
        try {
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            assertEquals(hasMane, actual);
        } catch (Exception lionSexException){
        Assert.fail("Exception " + lionSexException);
    }
}
}
