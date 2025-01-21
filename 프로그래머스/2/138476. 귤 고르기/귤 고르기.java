import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int solution(int k, int[] tangerine) {
		int answer = 0;
		Map<Integer, Integer> tM = new HashMap<>();
		for (int t : tangerine) {
			tM.put(t, tM.getOrDefault(t, 0) + 1);
		}
		PriorityQueue<int[]> pq = new PriorityQueue<>((x, y) -> y[1] - x[1]);
		PriorityQueue<int[]> pq2 = new PriorityQueue<>((x, y) -> y[1] - x[1]);

		for (Map.Entry<Integer, Integer> t : tM.entrySet()) {
			pq.add(new int[]{t.getKey(), t.getValue()});
		}
		int cnt = 0;
		while (!pq.isEmpty() && cnt != k) {
			int[] kv = pq.poll();
			int value = kv[1];
			cnt += value;
			pq2.add(kv);
			if (cnt > k) break;
		}

		return pq2.size();
	}
}