package org.koreait;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int 별 = sc.nextInt();
        String 별그림 = "";
        int 횟수 = sc.nextInt();

        for(int i = 0; i < 별; i++) {
            별그림 += "*";
        }

        for (int i = 0; i < 횟수; i++) {
            System.out.println(별그림);
        }

    }
}