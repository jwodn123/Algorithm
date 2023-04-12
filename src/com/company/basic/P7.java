//너의 평점은

package com.company.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> average = new HashMap<>();
        average.put("A+", 4.5);
        average.put("A0", 4.0);
        average.put("B+", 3.5);
        average.put("B0", 3.0);
        average.put("C+", 2.5);
        average.put("C0", 2.0);
        average.put("D+", 1.5);
        average.put("D0", 1.0);
        average.put("F", 0.0);
        average.put("P", 0.0);

        double answer = 0.0;
        double scoreSum = 0.0;
        double sum = 0.0;

        for(int i = 0; i < 20; i++) {
            String className = sc.next(); //과목
            double score = sc.nextDouble(); //학점
            String grade = sc.next(); //등급합

            if(!grade.equals("P")){
                scoreSum += score; //학점의 총
            }

            if(average.containsKey(grade)) {
                sum += score * average.get(grade); //(학점 * 과목평점)의 총
            }

            answer = sum / scoreSum;
        }

        System.out.println(answer);


    }
}
