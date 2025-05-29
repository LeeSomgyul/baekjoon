import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        String[] parts = scan.nextLine().split(" ");

        int max = Integer.parseInt(parts[0]);
        int min = max;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(parts[i]);
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.print(min + " " + max);
    }
}