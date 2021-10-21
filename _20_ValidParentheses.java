package problem;

import java.util.Stack;

public class _20_ValidParentheses {
    static class Solution {
        public static boolean isValid(String s) {
            int n = s.length();
            if (n % 2 == 1) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '(' || c == '[' || c == '{')
                    stack.push(c);
                if(c == ')' || c == ']' || c == '}'){
                    if(stack.isEmpty())
                        return false;
                    switch (stack.pop()) {
                        case '(':
                            if(c != ')')
                                return false;
                            break;
                        case '[':
                            if(c != ']')
                                return false;
                            break;
                        case '{':
                            if (c != '}')
                                return false;
                            break;
                        default:
                            return false;
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.isValid("{{[()()(()(())())()]}}"));
    }
}
