import java.util.Scanner;

public class average_1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];

        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // 🔥정수형으로 하면 / 했을 때 값이 0이 되어버림
        double sum = 0;

        for (int i = 0; i < N; i++) {
            double newScore = ((double) arr[i] / max) * 100;
            sum += newScore;
        }

        System.out.println(sum / N);

    }
}
