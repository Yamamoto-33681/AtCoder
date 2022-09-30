package CookiieExchanges;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int count = 0;

        while (A % 2 == 0 && B % 2 == 0 && C % 2 == 0) {

            if (A == B && B == C) {
                System.out.println(-1);
                return;
            }

            count++;

            int a = A;
            int b = B;
            int c = C;

            A = (b / 2) + (c / 2);
            B = (a / 2) + (c / 2);
            C = (a / 2) + (b / 2);

        }

        System.out.println(count);

    }
}