package com.company.Sort_Application;

/*
문제
온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다.
이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다.
나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.

출력
첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
* */

import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[][] arr = new String[N][2];

        for(int i = 0; i < N; i++) {
            arr[i][0] = sc.next(); //나이
            arr[i][1] = sc.next(); //이
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                //o1의 첫 번째 요소가 o2의 첫 번째 요소보다 작으면 음수가 되고, o1의 첫 번째 요소가 o2의 첫 번째 요소보다 크면 양수가 되고, 동일하면 0이 됩니다.
                //Arrays.sort() 메서드는 이 비교를 사용하여 정렬된 배열의 요소 순서를 결정합니다. 반환 값이 음수이면 정렬된 배열에서 o1이 o2 앞에 옵니다.
                //양수이면 o1이 o2 뒤에 옵니다. 0이면 정렬 목적으로 o1과 o2가 동일한 것으로 간주되며 상대 순서는 임의입니다.
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i = 0; i < N; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
