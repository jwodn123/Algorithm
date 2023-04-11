import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        //d 배열 오름차순 정렬
        Arrays.sort(d);
        
        //for문 돌면서 budget - d[i] == 0 인 경우를 찾는다
        for(int i = 0; i < d.length; i++) {
            if(budget - d[i] >= 0) {
                budget -= d[i]; 
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}