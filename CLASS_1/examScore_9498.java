package CLASS_1;

import java.util.Scanner;

public class examScore_9498 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N >= 90) {
            System.out.println("A");
        } else if (N >= 80) {
            System.out.println("B");
        } else if (N >= 70) {
            System.out.println("C");
        } else if (N >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}