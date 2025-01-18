class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = check(n);
        
        for (int i = n + 1; i < n * 2; i++) {
            if (cnt == check(i)) return i;
        }
        return answer;
    }
    
    private int check(int i) {
        String num = Integer.toBinaryString(i);
        char[] tmp = num.toCharArray();
        int count = 0;
        for (int j = 0; j < tmp.length; j++) {
            if (tmp[j] == '1') count++;
        }
        
        return count;
    }
}