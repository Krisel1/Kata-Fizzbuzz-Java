import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void calculate_Number_Divisible_by_3() {

    String result = Main.fizzBuzzNumber(3);

    assertEquals(result, "Fizz");

    }

    @Test
    public void calculate_Number_Divisible_by_5() {

        String result = Main.fizzBuzzNumber(5);

        assertEquals(result, "Buzz");

    }

    @Test
    public void calculate_Number_Divisible_by_3_and_5() {

        String result = Main.fizzBuzzNumber(15);

        assertEquals(result, "FizzBuzz");

    }

    @Test
    public void calculate_Number2_Divisible_by_3_and_5() {

        String result = Main.fizzBuzzNumber(30);

        assertEquals(result, "FizzBuzz");

    }

    @Test
    public void calculate_Number_No_Divisible() {

        String result = Main.fizzBuzzNumber(8);

        assertEquals(result, "8");

    }

}
