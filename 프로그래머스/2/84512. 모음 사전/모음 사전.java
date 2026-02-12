import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String AEIOU = "AEIOU";
	private List<String> result;
	private boolean isFound = false;
	private String word;
	public int solution(String word) {
		this.word = word;
		this.result = new ArrayList<>();
		String[] alpha = AEIOU.split("");
		for (int i = 0; i < alpha.length; i++) {
			dfs(alpha[i], alpha, 1);
		}
		return result.indexOf(word) + 1;
	}

	private void dfs(String a, String[] alpha, int depth) {
		result.add(a);
		if (a.equals(word)) {
			isFound = true;
			return;
		}
		if (depth==AEIOU.length()) return;
		for (String s : alpha) {
			if (isFound) return;
			dfs(a + s, alpha, depth + 1);
			if (isFound) return;
		}
	}
}