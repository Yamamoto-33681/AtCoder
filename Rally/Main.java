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

        int sum = locates.stream().mapToInt(Integer::intValue).sum();

        int p = sum / people;

        if (sum % people != 0) {
            p++;
        }

        List<Integer> hp = new ArrayList<Integer>();

        for (int i = 0; i < people; i++) {

            hp.add((locates.get(i) - p) * (locates.get(i) - p));

        }

        int sumHp = hp.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sumHp);

        // System.out.println(people);

        // System.out.println(locates.get(0));

    }
}