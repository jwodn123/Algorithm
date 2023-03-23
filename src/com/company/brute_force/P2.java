package com.company.brute_force;

/*
문제
왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.

입력
아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.

출력
일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2 {

    //모든 경우를 탐색하여 7명 키의 합이 100이 되는 값을 리턴
    public static int func(ArrayList<Integer> harr, int nan1, int nan2) {
        int ret = 0;
        for(int i = 0; i < harr.size(); i++) {
            if(i == nan1 || i == nan2) {
                continue;
            }
            ret += harr.get(i);
        }
        return ret;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> harr = new ArrayList<>(); //난쟁이 키를 담은 배열

        //9명의 키를 입력 받아서 배열에 담는다.
        for(int i = 0; i < 9; i++) {
            harr.add(sc.nextInt());
        }

        //7명 키의 합 100이 되는 경우를 찾고 나머지 2명은 제외시킨다.
        int nan1 = 0;
        int nan2 = 0;

        for(int i = 0; i < 9; i++) {
            for(int j = i + 1; j < 9; j++) {
                if(100 == func(harr, i, j)) {
                    nan1 = i;
                    nan2 = j;
                }
            }
        }
        harr.remove(nan2);
        harr.remove(nan1);


        //오름차순으로 정렬해서 출력.
        Collections.sort(harr);
        for(int i = 0; i < harr.size(); i++) {
            System.out.println(harr.get(i));
        }
    }


}
