class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0; //각 자릿수의 합
        int num = x;
        
        //x의 각 자리수의 합을 구한다.
        while(x > 0) {
            sum += x%10;
            x /= 10;
        }
        
        //x와 자릿수의 합을 나눈 나머지가 0(true), 1(false)
        if(num % sum != 0) {
            answer = false;
        }
        
        return answer;
    }
}