package GoToTheSchool;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] people = new int[N];

        for (int i = 0; i < N; i++) {
            people[sc.nextInt() - 1] = i + 1;
        }

        for (int i = 0; i < N; i++) {
            System.out.println(people[i] + " ");
        }

    }
}