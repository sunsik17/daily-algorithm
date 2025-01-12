import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            if(stack.isEmpty() && c == ')') return false;
            if('(' == c) stack.push(c);
            if(')' == c) stack.pop();
        }
        return stack.isEmpty();
    }
}