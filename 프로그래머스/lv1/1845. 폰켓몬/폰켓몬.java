class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    nums[j] = 0;
                }
            }
        }
        
        //nums => 3 0 0 2 0 4
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                answer++;
            }
        }
        
        if(answer > nums.length/2) {
            answer = nums.length/2;
        } 
        
        return answer;
    }
}