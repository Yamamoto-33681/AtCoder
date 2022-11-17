package Alchemist;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        int[] value = new int[N];

        for (int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(value);

        double now = value[0];

        for (int i = 1; i < N; i++) {
            now = (value[i] + now) / 2.0;
        }

        System.out.println(now);

    }
}