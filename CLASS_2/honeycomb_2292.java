import java.util.Scanner;

public class honeycomb_2292 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int V = 1;
        int result = 1;

        while (N > V) {
            V += 6 * result;
            result += 1;
        }

        if (N == 1) {
            System.out.println(1);
        } else {
            System.out.println(result);
        }
    }
}