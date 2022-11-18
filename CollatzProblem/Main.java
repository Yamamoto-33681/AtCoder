package CollatzProblem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> aList = new ArrayList<>();

        int now = Integer.parseInt(sc.next());

        aList.add(now);

        boolean flag = false;

        while (!flag) {

            if (now % 2 == 0) {
                now = now / 2;
            } else {
                now = 3 * now + 1;
            }

            if (aList.contains(now)) {
                System.out.println(aList.size() + 1);
                flag = true;
            }

            aList.add(now);
        }

    }
}