package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineWithParametrizedTest {

    private final int expectedKittensNumber;
    private final int actualKittensNumber;

    public FelineWithParametrizedTest(int expectedKittensNumber, int actualKittensNumber) {
        this.expectedKittensNumber = expectedKittensNumber;
        this.actualKittensNumber = actualKittensNumber;
    }

    @Parameterized.Parameters
    public static Object[] getCount() {
    return new Object[][] {
            {1, 1},
            {2, 2}, // передали тестовые данные
            };
        }

       @Test
        public void getKittensWithKittensReturnPositiveResult() {
            Feline feline = new Feline();
            int actual = feline.getKittens(actualKittensNumber);
            assertEquals(expectedKittensNumber, actual);
    }
}