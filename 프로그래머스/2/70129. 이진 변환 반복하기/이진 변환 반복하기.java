class Solution {
	int result = 0;
	String s;
	int count = 0;
	public int[] solution(String s) {
		this.s = s;
		while (convert(this.s)) {}

		return new int[]{this.count, result};
	}
	private boolean convert(String s) {
		int len = s.length();
		int cnt = 0;
		for (char c : s.toCharArray()) {
			if (c == '0') {
				cnt++;
			}
		}
		result += cnt;
		this.s = Integer.toBinaryString(len - cnt);
		this.count++;
        if (this.s.length() == 1) return false;
		int cnt1 = 0;
		for (char c : this.s.toCharArray()) {
			if (c == '1') {
				cnt1++;
			}
		}
		if (cnt1 == 1) {
			result += this.s.length() - cnt1;
			this.count++;
		}
		return cnt1 != 1;
	}
}