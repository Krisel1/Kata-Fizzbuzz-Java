import org.example.FizzBuzzNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void calculate_Number_Divisible_by_3() {

    FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(3);

    assertEquals(fizzBuzzNumber.getNumber(), "Fizz");

    }

    @Test
    public void calculate_Number_Divisible_by_5() {

        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(5);

        assertEquals(fizzBuzzNumber.getNumber(), "Buzz");

    }

    @Test
    public void calculate_Number_Divisible_by_3_and_5() {

        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(15);

        assertEquals(fizzBuzzNumber.getNumber(), "FizzBuzz");

    }

    @Test
    public void calculate_Number2_Divisible_by_3_and_5() {

        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(30);

        assertEquals(fizzBuzzNumber.getNumber(), "FizzBuzz");

    }

    @Test
    public void calculate_Number_No_Divisible_by_3_and_5() {

        FizzBuzzNumber fizzBuzzNumber = new FizzBuzzNumber(4);

        assertEquals(fizzBuzzNumber.getNumber(), "4");

    }

}
