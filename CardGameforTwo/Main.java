package CardGameforTwo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            numbers.add(sc.nextInt());
        }

        int alicePoint = 0;

        int bobPoint = 0;

        for (int i = 0; i < N / 2; i++) {
            alicePoint += Collections.max(numbers);
            numbers.remove(numbers.indexOf(Collections.max(numbers)));
            bobPoint += Collections.max(numbers);
            numbers.remove(numbers.indexOf(Collections.max(numbers)));
        }

        if (N % 2 == 1) {
            alicePoint += Collections.max(numbers);
            numbers.remove(numbers.indexOf(Collections.max(numbers)));
        }

        System.out.println(alicePoint - bobPoint);

    }
}