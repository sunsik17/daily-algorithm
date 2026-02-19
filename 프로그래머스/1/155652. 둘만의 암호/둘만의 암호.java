import java.util.Arrays;

class Solution {
    private int a = (int)'a';
	private int z = (int)'z';
	private StringBuilder sb = new StringBuilder();
	public String solution(String s, String skip, int index) {
		char[] chars = s.toCharArray();
		char[] skipChars = skip.toCharArray();
		Arrays.sort(skipChars);
		for(char ch : chars) {
			sb.append(skip(ch, index, skipChars));
		}
		return sb.toString();
	}
	private char skip(char c, int idx, char[] chars) {
		int count = 0;
		char current = c;
		while (count < idx) {
			current++;
			if (current > z) {
				current = (char) a;
			}
			boolean isSkip = false;
			for (char skip : chars) {
				if (current == skip) {
					isSkip = true;
					break;
				}
			}
			if (!isSkip) {
				count++;
			}
		}
		return current;
	}
}