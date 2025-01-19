class Solution {
    
//     long cnt = 0;
    
//     public long solution(int n) {
//         long answer = 0;
//         dfs(n, 0);
//         return cnt;
//     }
    
//     private void dfs(int n, int cur) {
//         if (cur == n) {
//             cnt++;
//             return;
//         }
//         if (cur > n) return;
//         dfs(n, cur + 1);
//         dfs(n, cur + 2);
//     }
    public long solution(int n) {
        if (n < 2) return 1L;
        long[] dp = new long[n + 1];
        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 2L;
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567L;
        }
        return dp[n];
    }
}