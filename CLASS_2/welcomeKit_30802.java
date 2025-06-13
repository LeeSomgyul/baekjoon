package CLASS_2;

import java.util.Scanner;

public class welcomeKit_30802 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[6];

        for (int i = 0; i < 6; i++) {
            arr[i] = scan.nextInt();
        }

        int T = scan.nextInt();
        int P = scan.nextInt();

        int tResult = 0;

        for (int i = 0; i < 6; i++) {
            // 🔥 "정수 나눗셈에서 올림" 방식으로 (a + b - 1) / b 공식이 자주 쓰인다
            tResult += (arr[i] + T - 1) / T;
        }

        System.out.println(tResult);
        System.out.println(N / P + " " + N % P);

    }
}
