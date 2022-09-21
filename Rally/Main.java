package Rally;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = sc.nextInt();

        List<Integer> locates = new ArrayList<Integer>();

        for (int i = 0; i < people; i++) {
            locates.add(sc.nextInt());
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= 100; i++) {

            List<Integer> hp = new ArrayList<Integer>();

            for (int j = 0; j < people; j++) {
                hp.add((locates.get(j) - i) * (locates.get(j) - i));
            }

            int sumHp = hp.stream().mapToInt(Integer::intValue).sum();

            if (min > sumHp) {
                min = sumHp;
            }
        }

        System.out.println(min);

        // System.out.println(people);

        // System.out.println(locates.get(0));

    }
}