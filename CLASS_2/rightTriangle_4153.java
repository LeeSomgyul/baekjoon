package CLASS_2;

import java.util.Arrays;
import java.util.Scanner;

public class rightTriangle_4153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            int[] arr = new int[3];

            arr[0] = scan.nextInt();
            arr[1] = scan.nextInt();
            arr[2] = scan.nextInt();

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            // 🔥 A,B,C 중 가장 긴 길이가 빗변 C라는 것을 명시해 주어야 한다.
            Arrays.sort(arr);

            int A = arr[0];
            int B = arr[1];
            int C = arr[2];

            int sum = A * A + B * B;

            if (sum == C * C) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
