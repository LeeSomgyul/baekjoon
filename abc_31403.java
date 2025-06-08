import java.util.Scanner;

public class abc_31403 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        String stringA = Integer.toString(A);
        String stringB = Integer.toString(B);

        int abPlus = Integer.parseInt(stringA + stringB);

        System.out.println(A + B - C);
        System.out.println(abPlus - C);
    }
}
