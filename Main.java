import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        int max = 0;
        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < N; i++) {
            double newScore = ((double) arr[i] / max) * 100;
            sum += newScore;
        }

        System.out.println(sum / N);

    }
}