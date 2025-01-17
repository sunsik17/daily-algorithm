class Solution {
	public int solution(int n) {
		int answer = 0;
		int tmp = 0;
		for (int i = 1; i <= n / 2; i++) {
			tmp = i;
			for (int j = i + 1; j <= n + 1; j++) {
				tmp += j;
				if (tmp > n) break;
				if (tmp == n) {
					answer++;
					break;
				}
			}
		}
		return answer + 1;
	}
}
