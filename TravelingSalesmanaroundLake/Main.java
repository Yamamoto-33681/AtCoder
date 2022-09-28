package TravelingSalesmanaroundLake;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        int N = sc.nextInt();

        int[] houses = new int[N];

        for (int i = 0; i < N; i++) {
            houses[i] = sc.nextInt();
        }

        int max = K - houses[N - 1] + houses[0];

        // 円周の回らなくていい部分をだして、Kからそれを引く
        for (int i = 1; i < N; i++) {
            max = Math.max(max, houses[i] - houses[i - 1]);
        }

        int answer = K - max;

        System.out.println(answer);

    }
}