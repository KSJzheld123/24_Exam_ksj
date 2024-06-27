package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int 숫자 = sc.nextInt();

        for (int i = 숫자; i > 0; i--) {
            String 결과값 = "";
            int 모양 = 숫자 - i;

            for (int j = 모양; j > 0; j--) {
                결과값 += " ";
            }

            for (int j = 0; j < i; j++) {
                결과값 += String.valueOf(i - j) + " ";
            }

            System.out.println(결과값);
        }
    }
}