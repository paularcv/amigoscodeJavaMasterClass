package com.amigoscode.dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class E1Test {

    String[] input = {"1, 2, 2"};

    @Test
    void itShouldCountOccurrences() {

        String result = E1.countOccurrences(input).toString();
        assertEquals("{1=1, 2=2}", result);
    }

    @Test
    void itShouldFindMostOccurrences() {
        String result = E1.mostOccurrences(input);
        assertEquals("2", result);
    }

}