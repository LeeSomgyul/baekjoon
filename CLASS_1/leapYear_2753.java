package CLASS_1;

import java.util.Scanner;

public class leapYear_2753 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();

        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("1");
            }
        } else {
            System.out.println("0");
        }
    }
}
