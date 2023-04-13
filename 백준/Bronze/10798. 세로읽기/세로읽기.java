import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[5][15];
        int max = 0; //입력받은 문자열의 가장 긴 길이

        for(int i = 0; i < 5; i++) {
            String str = sc.next();
            max = Math.max(max, str.length());
            for(int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        String answer = "";
        for(int i = 0; i < max; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[j][i] != '\0') { //null이 아닐 때, if(arr[j][i] != ' ') -> 에러
                    answer += arr[j][i];
                }
            }
        }

        System.out.println(answer);


    }

}