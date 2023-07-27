class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        String[] T = new String[t.length() - p.length() + 1];
        
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
            T[i] = t.substring(i, p.length() + i);
            if(Long.parseLong(T[i]) <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}