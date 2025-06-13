package CLASS_1;

import java.util.Scanner;

public class numberDigits_2577 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int M = A * B * C;

        String str = Integer.toString(M);
        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int digit = c - '0';
            arr[digit]++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        scan.close();
    }
}