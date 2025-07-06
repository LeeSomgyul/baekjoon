import java.util.Scanner;

public class snailClimb_2869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        double front = (double) (V - A) / (A - B);
        int days = (int) Math.ceil(front) + 1;

        System.out.println(days);

    }
}
