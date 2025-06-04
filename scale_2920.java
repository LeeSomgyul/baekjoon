import java.util.Arrays;
import java.util.Scanner;

public class scale_2920 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = new int[8];
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr2 = { 8, 7, 6, 5, 4, 3, 2, 1 };

        for (int i = 0; i < 8; i++) {
            input[i] = scan.nextInt();
        }

        if (Arrays.equals(input, arr1)) {
            System.out.println("ascending");
        } else if (Arrays.equals(input, arr2)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        scan.close();

    }
}
