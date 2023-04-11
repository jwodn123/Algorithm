package com.company.basic;

import java.util.Locale;
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] arr = new int[26];

        //문자의 아스키코드 활용
        for(int i = 0; i < str.length(); i++) {
            if(65 <= str.charAt(i) && str.charAt(i) <= 90) {
                arr[str.charAt(i) - 65]++;
            } else {
                arr[str.charAt(i) - 97]++;
            }
        }

        int max = 0;
        char answer = '?';

        for(int i = 0; i < 26; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer = (char)(i + 65);
            } else if(arr[i] == max) {
                answer = '?';
            }
        }

        System.out.println(answer);



    }
}
