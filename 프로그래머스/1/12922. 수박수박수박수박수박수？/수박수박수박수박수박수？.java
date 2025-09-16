class Solution {
    private final String watermelon = "수박";
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n / 2; i++) {
            sb.append(watermelon);
        }
        
        if(n % 2 == 1) sb.append("수");
    
        return sb.toString();
    }
}