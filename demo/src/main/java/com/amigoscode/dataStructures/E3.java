package com.amigoscode.dataStructures;

import java.util.Stack;

public class E3 {

    // E3
    // given the string brackets, check if the following parentheses are balanced
    // the method should return true if the parentheses are balanced and false if they are not
    // for each corresponding opening bracket there should be a closing bracket
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            // if the character is an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // if the character is a cosing bracket, check if the stack is empty
                if (stack.isEmpty()) {
                    return false;
                }
                // pop an element from the stack
                char top = stack.pop();
                // check if the popped element is the corresponding opening bracket
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        // if the stack is empty, all brackets are balanced
        return stack.isEmpty();
    }
}
