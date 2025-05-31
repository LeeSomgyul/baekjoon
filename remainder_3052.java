import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class remainder_3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = scan.nextInt();
            set.add(numbers[i] % 42);
        }

        System.out.println(set.size());

    }
}
