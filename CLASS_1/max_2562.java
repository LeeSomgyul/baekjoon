package CLASS_1;

import java.util.Scanner;

public class max_2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[9];

        int max = arr[0];
        int index = 0;

        for (int i = 0; i < 9; i++) {
            int N = scan.nextInt();
            arr[i] += N;
        }

        for (int i = 0; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
