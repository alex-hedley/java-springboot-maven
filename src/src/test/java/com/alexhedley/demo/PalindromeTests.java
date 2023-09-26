package com.alexhedley.demo;

import org.junit.jupiter.api.Test;

import static org.springframework.test.util.AssertionErrors.assertTrue;

public class PalindromeTests {
    @Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue("", palindromeTester.isPalindrome(""));
    }
}
