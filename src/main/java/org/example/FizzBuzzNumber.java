package org.example;

public class FizzBuzzNumber {
    private final int number;

    public FizzBuzzNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return getNumber();
    }

    public String getNumber() {
        if (number % 3 == 0 && number % 5 == 0) {
            return  "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}


