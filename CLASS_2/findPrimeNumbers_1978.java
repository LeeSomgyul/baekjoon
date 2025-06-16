package CLASS_2;

import java.util.Scanner;

public class findPrimeNumbers_1978 {
    public static boolean isPrime(int number) {
        if (number < 2)
            return false;

        // 🔥 소수 찾기 암기 공식
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int number = scan.nextInt();
            if (isPrime(number)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
