package org.koreait;

public class Main {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        String 수열 = "0 1 ";

        for(int i = 0; i < 8; i++) {
            int c = a + b;
            a = b;
            b = c;
            수열 += (String.valueOf(c)) + " ";
        }

        System.out.println(수열);

    }
}