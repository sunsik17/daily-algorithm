import java.util.*;

class Solution {
    private static final String OPEN = "({[";
	private static final String CLOSE = ")}]";
	private static boolean[] check;

	public int solution(String s) {
		int answer = 0;
		Stack<Character> stack = new Stack<>();
		StringBuilder sb;
		String tmp;
		for(int i = 0; i < s.length(); i++) {
			sb = new StringBuilder();
			if(i == 0) {
				tmp = s;
			} else {
				sb.append(s.substring(i));
				sb.append(s, 0, i);
				tmp = sb.toString();
			}
			char[] chars = tmp.toCharArray();
			if (CLOSE.contains(String.valueOf(chars[0]))) continue;
			stack.push(chars[0]);
			check = new boolean[chars.length];
			check[OPEN.indexOf(chars[0])] = true;
			for (int j = 1; j < chars.length; j++) {
				if (stack.isEmpty()) {
					if (CLOSE.contains(String.valueOf(chars[j]))) break;
				}
				if (OPEN.contains(String.valueOf(chars[j]))) {
					stack.push(chars[j]);
					check = new boolean[chars.length];
					check[OPEN.indexOf(chars[j])] = true;
					continue;
				}
				int idx = CLOSE.indexOf(chars[j]);
				if (stack.peek() == OPEN.charAt(idx) && check[idx] ) {
					check[idx] = false;
					stack.pop();
					if (stack.isEmpty()) {
						if (j == chars.length - 1) answer++;
					} else {
						check[OPEN.indexOf(String.valueOf(stack.peek()))] = true;
					}
				} else break;
			}
		}
		return answer;
	}
}