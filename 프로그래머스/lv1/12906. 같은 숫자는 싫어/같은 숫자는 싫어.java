import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
    

        //연속된 수 제외시키고 ArrayList에 값 담기
        int temp = 10;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != temp) {
                list.add(arr[i]);
                temp = arr[i];
            }
        }
        
        //ArrayList를 다시 배열에 담기
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}