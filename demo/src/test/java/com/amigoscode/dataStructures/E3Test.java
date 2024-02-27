package com.amigoscode.dataStructures;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class E3Test {

    @Test
    void testIsBalanced() {

        E3 checker = new E3();
        String brackets1 = "[{{[(){}]}}[]{}{{(())}}]";
        assertTrue(checker.isBalanced(brackets1));

        String brackets2 = "[{{}}[]{}{{(())}}]";
        assertTrue(checker.isBalanced(brackets2));

        String brackets3 = "[{}{}{{()}}]";
        assertTrue(checker.isBalanced(brackets3));

        String brackets4 = "[{}{{}}]";
        assertTrue(checker.isBalanced(brackets4));

        String brackets5 = "[{{}}]";
        assertTrue(checker.isBalanced(brackets5));

        String brackets6 = "[{}]";
        assertTrue(checker.isBalanced(brackets6));

        String brackets7 = "";
        assertTrue(checker.isBalanced(brackets7));

        String brackets8 = "({{}}]";
        assertFalse(checker.isBalanced(brackets8));

        String brackets9 = "({}]";
        assertFalse(checker.isBalanced(brackets9));

        String brackets10 = "(]";
        assertFalse(checker.isBalanced(brackets10));
    }

}