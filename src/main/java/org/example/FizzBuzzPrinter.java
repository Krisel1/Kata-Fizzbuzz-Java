package org.example;

public class FizzBuzzPrinter {
    public void printNumber() {
        for (int i = 1; i <= 100; i++) {
            FizzBuzzNumber number = new FizzBuzzNumber(i);
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        FizzBuzzPrinter fizzBuzzNumber = new FizzBuzzPrinter();
        fizzBuzzNumber.printNumber();
    }
}