import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public String solution(String s) {
        Deque<String> q = new LinkedList<>();
        int index = 0;
        char[] cArr = s.toCharArray();
        int len = cArr.length;
        
        while (index < len) {
            char c = cArr[index];
            if (c == ' ') {
                q.add(String.valueOf(c));    
            } else if (q.isEmpty() && c != ' ') {
                q.add(String.valueOf(c).toUpperCase());
            } else if (" ".equals(q.getLast()) && c != ' ') {
                q.add(String.valueOf(c).toUpperCase());   
            } else {
                q.add(String.valueOf(c).toLowerCase());
            }
            System.out.print(q.getLast());
            
            index++;
        }
        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            sb.append(q.poll());
        }
        return sb.toString();
    }
}