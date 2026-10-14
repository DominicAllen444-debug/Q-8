package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void identifiesNumberPalindromes() {
        assertTrue(new App().isPalindromeNumber(121));
        assertTrue(new App().isPalindromeNumber(0));
    }

    @Test
    void rejectsNonPalindromesAndNegativeNumbers() {
        assertFalse(new App().isPalindromeNumber(123));
        assertFalse(new App().isPalindromeNumber(-121));
    }
}
