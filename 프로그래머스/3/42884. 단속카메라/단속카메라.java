import java.util.Arrays;

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
		Arrays.sort(routes, (x, y) -> x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]);
        int pivot = routes[0][1];
        System.out.print(Arrays.deepToString(routes));
        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] <= pivot) continue;
            pivot = routes[i][1];
            answer++;
        }
        return answer;
    }
}