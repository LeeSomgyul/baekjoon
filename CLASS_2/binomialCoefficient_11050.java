import java.util.Scanner;

public class binomialCoefficient_11050 {
    public static int factorial(int value) {
        int result = 1;

        for (int i = 2; i <= value; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int result = factorial(N) / (factorial(K) * factorial(N - K));

        System.out.println(result);
    }
}