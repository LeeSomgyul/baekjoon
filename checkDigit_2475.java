import java.util.Scanner;

public class checkDigit_2475 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine().replaceAll(" ", "");

        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int digit = input.charAt(i) - '0';
            sum += digit * digit;
        }

        System.out.println(sum % 10);

    }
}
