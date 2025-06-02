import java.util.Arrays;
import java.util.Scanner;

public class findAlphabet_10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.next();

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < input.length(); i++) {
            int ch = input.charAt(i) - 'a';

            if (arr[ch] == -1) {
                arr[ch] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
