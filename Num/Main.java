package Num;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        int n2 = sc.nextInt();

        int n2Length = String.valueOf(n2).length();

        int n = n1 * (int) Math.pow(10.0, n2Length) + n2;

        double nn = Math.sqrt(n);

        if (nn % 1 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }

    }
}