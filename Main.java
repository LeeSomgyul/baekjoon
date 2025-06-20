import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();

        String S = scan.next();
        long result = 0;
        long pow = 1;

        for (int i = 0; i < N; i++) {
            int ch = S.charAt(i) - 'a' + 1;
            result = (result + ch * pow) % 1234567891;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(result);

    }
}