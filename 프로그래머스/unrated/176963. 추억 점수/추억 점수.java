import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String,Integer> map = new HashMap<>(); //<이름, 점수>
        
        for(int i=0; i< name.length; i++){
            map.put(name[i], yearning[i]); 
        }

        for(int i=0; i< photo.length; i++){
            String[] gr = photo[i]; 
            int score = 0;
            
            for(int j=0; j<gr.length; j++){
            	
                String person = gr[j];
                if(map.containsKey(person)){ 
                    score+=map.get(person); 
                }
            }
            answer[i]=score;
        }
        return answer;
    }
}