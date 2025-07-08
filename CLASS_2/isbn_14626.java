import java.util.Scanner;

public class isbn_14626 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int sum = 0;
        int weight = 1;

        int starWeight = 1;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '*') {
                starWeight = weight;
            } else {
                sum += (input.charAt(i) - '0') * weight;
            }

            weight = (weight == 1) ? 3 : 1;
        }

        for (int i = 0; i <= 9; i++) {
            int number = (sum + (i * starWeight)) % 10;
            if (number == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
