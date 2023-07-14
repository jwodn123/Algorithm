import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] num = s.split(" ");
        int[] values = new int[num.length];
    
        for(int i = 0; i < num.length; i++) {
            values[i] = Integer.parseInt(num[i]);
        }
        
        int minValue = Arrays.stream(values).min().orElse(0);
        int maxValue = Arrays.stream(values).max().orElse(0);
        
        answer = minValue + " " + maxValue;
        
        return answer;
    }
}