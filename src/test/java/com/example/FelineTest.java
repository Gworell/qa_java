package com.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void eatMeatWithListOfFoodPositiveResult() throws Exception{
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    @Test
    public void getFamilyThenReturnFelinePositiveResult() {
        String expected = "Кошачьи";
        String actual  = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensThenKittensAmountOnePositiveResult() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}