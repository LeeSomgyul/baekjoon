package CLASS_1;
/*
//1️⃣ 기본적인 반복문 사용
import java.util.Scanner;

public class star_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//2️⃣ repeat() 사용
import java.util.Scanner;

public class star_2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            String spaces = " ".repeat(N - i);
            String stars = "*".repeat(i);

            System.out.println(spaces + stars);
        }
    }
}
