import java.util.Scanner;

public class gcdLcm_2609 {
    public static int gcd(int A, int B) {
        while (B != 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }
        return A;
    }

    public static int lcm(int A, int B) {
        int result = A * B / gcd(A, B);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        int gcd = gcd(A, B);
        int lcm = lcm(A, B);

        System.out.println(gcd);
        System.out.println(lcm);
    }
}
