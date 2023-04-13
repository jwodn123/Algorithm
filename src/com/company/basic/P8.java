package com.company.basic;

import java.util.Arrays;
import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];
        int[][] answer = new int[N][M];

        //A
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arrA[i][j] = sc.nextInt();
            }
        }

        //B
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                arrB[i][j] = sc.nextInt();
            }
        }

        //A+B
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                answer[i][j] = arrA[i][j] + arrB[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }
}
