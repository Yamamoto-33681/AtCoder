package CollectingBalls;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int K = sc.nextInt();

        int[] ball = new int[N];

        for (int i = 0; i < N; i++) {
            ball[i] = sc.nextInt();
        }

        int distance = 0;

        for (int i = 0; i < N; i++) {
            if (ball[i] < K - ball[i]) {
                distance += ball[i] * 2;
            } else {
                distance += (K - ball[i]) * 2;
            }
        }

        System.out.println(distance);

    }
}