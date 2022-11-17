package TollGates;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        int M = Integer.parseInt(sc.next());

        int X = Integer.parseInt(sc.next());

        int Over_N = 0;

        int Under_N = 0;

        for (int i = 0; i < M; i++) {
            if (Integer.parseInt(sc.next()) > X) {
                Over_N++;
            } else {
                Under_N++;
            }
        }

        if (Over_N >= Under_N) {
            System.out.println(Under_N);
        } else {
            System.out.println(Over_N);
        }

    }
}