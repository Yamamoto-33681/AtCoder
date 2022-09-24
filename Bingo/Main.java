package Bingo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] bingo = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                bingo[i][j] = sc.nextInt();
            }
        }

        int N = sc.nextInt();

        List<Integer> selectNum = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            selectNum.add(sc.nextInt());
        }

        // 横で揃っているか確かめる
        for (int i = 0; i < 3; i++) {
            boolean A1 = selectNum.contains(bingo[i][0]);
            boolean A2 = selectNum.contains(bingo[i][1]);
            boolean A3 = selectNum.contains(bingo[i][2]);

            if (A1 && A2 && A3) {
                System.out.println("Yes");
                return;
            }
        }

        // 縦で揃っているか確かめる
        for (int i = 0; i < 3; i++) {
            boolean B1 = selectNum.contains(bingo[0][i]);
            boolean B2 = selectNum.contains(bingo[1][i]);
            boolean B3 = selectNum.contains(bingo[2][i]);

            if (B1 && B2 && B3) {
                System.out.println("Yes");
                return;
            }
        }

        // 斜めで揃っているか確かめる
        boolean C1 = selectNum.contains(bingo[0][0]);
        boolean C2 = selectNum.contains(bingo[1][1]);
        boolean C3 = selectNum.contains(bingo[2][2]);

        if (C1 && C2 && C3) {
            System.out.println("Yes");
            return;
        }
        // 斜めで揃っているか確かめる
        boolean D1 = selectNum.contains(bingo[0][2]);
        boolean D2 = selectNum.contains(bingo[1][1]);
        boolean D3 = selectNum.contains(bingo[2][0]);

        if (D1 && D2 && D3) {
            System.out.println("Yes");
            return;
        }

        System.out.println("No");

    }
}