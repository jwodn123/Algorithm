import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String W = sc.next();
        int answer = 0;

        for(int i = 0; i < N; i++) {
            answer += W.charAt(i)-48;
        }

        System.out.println(answer);
    }
}