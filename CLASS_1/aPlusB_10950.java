package CLASS_1;

import java.util.Scanner;

public class aPlusB_10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int A = scan.nextInt();
            int B = scan.nextInt();

            System.out.println(A + B);
        }
    }
}
