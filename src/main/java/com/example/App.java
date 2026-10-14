package com.example;

public class App {
    public boolean isPalindromeNumber(int number) {
        if (number < 0) {
            return false;
        }
        return number == reverseNumber(number);
    }

    private long reverseNumber(int number) {
        long remaining = number;
        long reversed = 0;
        while (remaining > 0) {
            reversed = reversed * 10 + remaining % 10;
            remaining /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        App app = new App();
        int number = 1221;
        System.out.println(number + (app.isPalindromeNumber(number) ? " is a palindrome" : " is not a palindrome"));
    }
}
