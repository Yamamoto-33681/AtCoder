package TaxRate;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int payment = sc.nextInt();

        for (int i = 0; i <= payment; i++) {
            if ((int) (i * 1.08) == payment) {
                System.out.println(i);
                break;
            }
            if (i == payment) {
                System.out.println(":(");
            }
        }

    }
}