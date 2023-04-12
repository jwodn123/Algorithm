class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int count = 0;
        int[] arr = new int[N];
        double[] fail = new double[N];
        
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j < stages.length; j++) {
                if(stages[j] == i) {
                    count++;  
                    arr[i-1] = count;
                }
            }
            count = 0;
        }
        
        //실패율 계산 -> double 배열에 담기
        int user = stages.length;
        for(int i = 0; i < arr.length; i++) {
            fail[i] = (double) arr[i] / user;
            user -= arr[i];
            answer[i]=i+1;
        }
        
        double tmpf = 0;
        int tmpa = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 1; j < N - i; j++) {
                if(fail[j-1] < fail[j]) {
                    tmpf = fail[j-1];
                    fail[j-1] = fail[j];
                    fail[j] = tmpf;

                    tmpa = answer[j-1];
                    answer[j-1] = answer[j];
                    answer[j] = tmpa;
                }
            }
        }
        
    
        
        return answer;
    }
}