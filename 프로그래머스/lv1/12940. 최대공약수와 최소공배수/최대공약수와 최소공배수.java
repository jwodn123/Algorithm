class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        
        while(min > 0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        
        answer[0] = max;
        answer[1] = n*m/max;
        
        return answer;
    }
}