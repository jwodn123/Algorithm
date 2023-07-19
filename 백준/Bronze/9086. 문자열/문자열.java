import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] word = new String[N];
        for(int i = 0; i < N; i++) {
            word[i] = sc.next();
        }

        for(int i = 0; i < N; i++) {
            String result = String.valueOf(word[i].charAt(0)) + word[i].charAt(word[i].length() - 1);
            System.out.println(result);
        }
    }
}
