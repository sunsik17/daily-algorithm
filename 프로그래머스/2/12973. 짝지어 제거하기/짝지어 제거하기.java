import java.util.Stack;

class Solution {
    public int solution(String s) {
		Stack<Character> stack = new Stack<>();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (stack.isEmpty()) {
				stack.push(c);
				continue;
			}
			if (stack.peek() == c) {
				stack.pop();
			} else stack.push(c);
		}
		return stack.isEmpty() ? 1 : 0;
	}
}