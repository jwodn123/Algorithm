import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        //n을 3진법으로 표현, 앞뒤 반전
        while(n != 0) {
            arr.add(n%3);
            n /= 3;
        } 
        
        // 3진법을 10진법으로
        int temp = 1;
        for(int i = arr.size()-1; i >= 0; i--) {
            answer += arr.get(i)*temp;
            temp *= 3;
        }
        
        return answer;
    }
}