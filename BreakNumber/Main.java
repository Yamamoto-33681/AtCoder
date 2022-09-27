package BreakNumber;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int countMax = 0;

        int answerNum = 0;

        if (N == 1) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i <= N; i++) {
            int count = 0;
            int num = i;

            while (num % 2 == 0) {
                count++;
                num = num / 2;
            }

            if (count > countMax) {
                countMax = count;
                answerNum = i;
            }
        }

        System.out.println(answerNum);

    }
}