class Solution {
    public int solution(int num) {
        int answer = 0; //몇번만에 실행되었는지 카운트
        long n = num; //오버플로우 발생하여 형변환
        
        
        while(n != 1) {
            //num이 짝수일 때
            if(n % 2 == 0) {
                n = n / 2;
            //num이 홀수일 때    
            } else {
                n = n * 3 + 1;
            }
            answer++;
            
            if(answer > 500) {
                return -1;
            }
        }
        
        return answer;
    }
}