package CLASS_1;

import java.util.Scanner;

public class acmHotel_10250 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int H = scan.nextInt();
            int W = scan.nextInt();
            int N = scan.nextInt();

            int front = (N % H == 0) ? H : N % H;
            int back = (N - 1) / H + 1;

            System.out.printf("%d%02d\n", front, back);
        }
    }
}
