package CLASS_1;

import java.util.Scanner;

public class wordCount_1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();

        String[] arr = line.trim().split(" ");

        System.out.println(arr.length);
    }
}
