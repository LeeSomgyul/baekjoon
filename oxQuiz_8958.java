import java.util.Scanner;

public class oxQuiz_8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = Integer.parseInt(scan.nextLine());
        String[] line = new String[T];

        for (int i = 0; i < T; i++) {
            line[i] = scan.nextLine();
        }

        int number = 0;
        int sumResult = 0;

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < line[i].length(); j++) {
                char ch = line[i].charAt(j);
                if (ch == 'O') {
                    sumResult += number + 1;
                    number += 1;
                } else {
                    number = 0;
                }
            }
            number = 0;
            System.out.println(sumResult);
            sumResult = 0;
        }

        scan.close();
    }
}
