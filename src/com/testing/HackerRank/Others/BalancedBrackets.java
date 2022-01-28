package com.testing.HackerRank.Others;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> brackets = new Stack();

        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    brackets.push(s.charAt(i));
                    break;
            }
            if (brackets.isEmpty()){
                return "NO";
            }
            switch (s.charAt(i)) {
                case ')':
                    if (brackets.peek() == '('){
                        brackets.pop();
                    } else {
                        return "NO";
                    }
                    break;
                case '}':
                    if (brackets.peek() == '{'){
                        brackets.pop();
                    } else {
                        return "NO";
                    }
                    break;
                case ']':
                    if (brackets.peek() == '['){
                        brackets.pop();
                    } else {
                        return "NO";
                    }
                    break;
            }
        }
        if (brackets.isEmpty()) {
            System.out.println("yes");
            return "YES";
        }

        return "NO";
    }
}
