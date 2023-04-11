import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arrList.add(i);
            }
        }
        
        for(int j = 0; j < arrList.size(); j++) {
            answer += arrList.get(j);
        }
        
        return answer;
    }
}