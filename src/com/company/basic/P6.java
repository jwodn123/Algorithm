//그룹 단어 체

package com.company.basic;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 0; //그룹 단어 수
        for(int i = 0; i < N; i++) {
            String str = sc.next();
            boolean[] alphabet = new boolean[26]; //사용된 문자 확인
            boolean tf = true; //그룹 단어 체크

            for(int j = 0; j < str.length(); j++) {
                int idx = str.charAt(j) - 97; //97->a
                if(alphabet[idx]) { //이미 사용된 문자라
                    if(str.charAt(j) != str.charAt(j-1)) { //연속된 문자가 아니라면
                        tf = false;
                        break;
                    }
                } else { //이전에 사용되지 않았다면
                    alphabet[idx] = true;
                }
            }
            if(tf) {
                count++;
            }


        }

        System.out.println(count);
    }
}
