package Bishop;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();

        long W = sc.nextLong();

        if (H == 1 || W == 1) {
            System.out.println(1);
            return;
        }

        if (H % 2 != 0 && W % 2 != 0) {
            System.out.println(H * W / 2 + 1);
        } else {
            System.out.println(H * W / 2);
        }

    }
}