import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] values = s.split(" ");
        for(int i = 0; i < values.length; i++) {
            String result = values[i];
            if(values[i].length() == 0) {
                answer += " ";
            } else {
                answer += result.substring(0, 1).toUpperCase();
                answer += result.substring(1, result.length()).toLowerCase();
                answer += " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")) {
            return answer;
        }
        
        
        return answer.substring(0, answer.length()-1);
    }
}