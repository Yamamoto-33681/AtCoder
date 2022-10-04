package ReplacingInteger;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        long K = sc.nextLong();

        while (N >= Math.abs(N - K)) {
            if (N % K == 0) {
                N = 0;
            } else if (N > K) {
                N %= K;
            } else {
                N = Math.min(N, Math.abs(N - K));
            }
        }
        System.out.println(N);

    }
}