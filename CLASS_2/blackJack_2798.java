import java.util.Scanner;

public class blackJack_2798 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[] list = new int[N];

        int bestSum = 0;

        for (int i = 0; i < N; i++) {
            list[i] = scan.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = list[i] + list[j] + list[k];
                    if (sum <= M && sum > bestSum) {
                        bestSum = sum;
                    }
                }
            }
        }

        System.out.println(bestSum);
    }
}