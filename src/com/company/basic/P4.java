package com.company.basic;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pel = sc.next();

        char[] repel = new char[pel.length()];

        int j = 0;
        for(int i = pel.length()-1; i >= 0; i--) {
            repel[j] = pel.charAt(i);
            j++;
        }

        if(pel.equals(String.valueOf(repel))) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
