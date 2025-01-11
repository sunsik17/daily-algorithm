class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean isPlus = true;
        boolean isNum = true;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < chars.length; i++) {
        if (chars[0] == '-') {
            isNum = false;
            isPlus = false;
            // continue;
        } else if (chars[0] == '+') isNum = false;
        if (isNum) {
            return Integer.parseInt(s);
        } else {
            answer = Integer.parseInt(s.substring(1));
            if (isPlus) return answer;
            else return -answer;   
        }
        // }
        // return answer;
    }
}