import java.util.Scanner;

public class palindromicNumber_1259 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();

            if (input.equals("0")) {
                break;
            }

            String reverse = new StringBuilder(input).reverse().toString();

            if (input.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
