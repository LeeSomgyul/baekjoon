package CLASS_1;

import java.util.Scanner;

public class stringRepetition_2675 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int T = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < T; i++) {
            String line = scan.nextLine();
            String[] parts = line.split(" ");
            int R = Integer.parseInt(parts[0]);
            String S = parts[1];

            StringBuilder result = new StringBuilder();

            for (int j = 0; j < S.length(); j++) {
                char ch = S.charAt(j);
                result.append(String.valueOf(ch).repeat(R));
            }

            System.out.println(result);
        }

        scan.close();
    }
}
