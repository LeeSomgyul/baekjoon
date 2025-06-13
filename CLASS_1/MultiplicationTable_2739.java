package CLASS_1;

import java.util.Scanner;

public class MultiplicationTable_2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}