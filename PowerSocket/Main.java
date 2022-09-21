package PowerSocket;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt() - 1;
        int b = sc.nextInt() - 1;

        int n = b / a;

        if (b % a != 0) {
            n++;
        }

        System.out.println(n);

        sc.close();
        // System.out.print(a);

    }
}