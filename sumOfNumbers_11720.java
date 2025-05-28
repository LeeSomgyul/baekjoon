import java.util.Scanner;

public class sumOfNumbers_11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String S = scan.next();

        int result = 0;

        for (int i = 0; i < N; i++) {
            char c = S.charAt(i);
            int number = c - '0';
            result += number;
        }

        System.out.println(result);
    }
}
