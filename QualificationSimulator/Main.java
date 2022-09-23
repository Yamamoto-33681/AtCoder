package QualificationSimulator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();

        int a = sc.nextInt();

        int b = sc.nextInt();

        String s = sc.next();

        // System.out.println(people);
        // System.out.println(a);
        int passCount = 0;
        int foreignerCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'b') {
                foreignerCount++;
            }

            if (passCount >= a + b || s.charAt(i) == 'c') {
                System.out.println("No");
            } else if (s.charAt(i) == 'b' && foreignerCount > b) {
                System.out.println("No");
            } else {
                passCount++;
                System.out.println("Yes");
            }
        }
    }
}