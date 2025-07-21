class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strings = s.split(" ");
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(String str : strings) {
            maxVal = Math.max(Integer.valueOf(str), maxVal);
            minVal = Math.min(Integer.valueOf(str), minVal);
        }
        answer = minVal + " " + maxVal;
        return answer;
    }
}