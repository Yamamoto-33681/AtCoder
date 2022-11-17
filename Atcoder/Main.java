package Atcoder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();

        int count = 0;

        int max = 0;

        for (int i = 0; i < N.length(); i++) {

            if (N.charAt(i) == 'A' || N.charAt(i) == 'T' || N.charAt(i) == 'G' || N.charAt(i) == 'C') {
                count++;
            } else {
                count = 0;
            }

            if (max < count) {
                max = count;
            }
        }

        System.out.println(max);

    }
}