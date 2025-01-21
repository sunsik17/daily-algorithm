class Solution {
    public int solution(int[] arr) {
		int gdc = gdc(arr[0], arr[1]);
		int lmc = arr[0] * arr[1] / gdc;

		for (int i = 2; i < arr.length; i++) {
            gdc = gdc(lmc, arr[i]);
			lmc = (lmc * arr[i]) / gdc;
		}
		return lmc;
	}
	
	private int gdc(int a, int b) {
		while (b != 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}
}