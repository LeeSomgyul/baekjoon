import java.util.Scanner;

public class characterString_27866 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.next();
        int i = scan.nextInt();

        char ch = S.charAt(i - 1);

        System.out.println(ch);
    }
}
