package DivideTheProblems;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Integer> dList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            dList.add(sc.nextInt());
        }

        Collections.sort(dList);

        int d1 = dList.get(N / 2);

        int d2 = dList.get(N / 2 - 1);

        int count = d1 - d2;

        System.out.println(count);

    }
}