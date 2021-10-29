package com.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {


        @Test
        public void getKittensCheckResultWithOneKittenTest () throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion("Самка", feline);
            int expected = 1;
            int actual = lion.getKittens();
            assertEquals(expected, actual);
        }

        @Test
        public void getFoodShouldHaveListOfFoodTest () throws Exception {
            Feline feline = new Feline();
            Lion lion = new Lion("Самец", feline);
            List<String> expected = List.of("Животные", "Птицы", "Рыба");
            List<String> actual = lion.getFood();
            assertEquals(expected, actual);
        }
}
