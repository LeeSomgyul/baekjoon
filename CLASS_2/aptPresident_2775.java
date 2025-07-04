import java.util.Scanner;

public class aptPresident_2775 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        int[][] apt = new int[15][15];

        for (int i = 1; i < 15; i++) {
            apt[0][i] = i;
        }

        for (int k = 1; k < 15; k++) {
            for (int n = 1; n < 15; n++) {
                for (int i = 1; i <= n; i++) {
                    apt[k][n] += apt[k - 1][i];
                }
            }
        }

        for (int i = 0; i < T; i++) {
            int k = scan.nextInt();
            int n = scan.nextInt();
            System.out.println(apt[k][n]);
        }
    }
}
