import java.util.Scanner;

public class digitsSum_2231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int digits = String.valueOf(N).length();
        int start = N - (digits * 9);

        int result = 0;

        for (int i = start; i < N; i++) {
            int temp = i;
            int sum = i;

            // 🔥 숫자를 한자리씩 떼내는 방법
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            if (N == sum) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}