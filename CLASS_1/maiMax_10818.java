package CLASS_1;

//🔥 더 간단한 코드
import java.util.Scanner;

public class maiMax_10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        String[] parts = scan.nextLine().split(" ");

        int max = Integer.parseInt(parts[0]);
        int min = max;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(parts[i]);
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }

        System.out.print(min + " " + max);
    }
}

/*
 * 🔥 처음에 하던 방식식
 * import java.util.Scanner;
 * 
 * public class maiMax_10818 {
 * public static void main(String[] args) {
 * Scanner scan = new Scanner(System.in);
 * 
 * int N = Integer.parseInt(scan.nextLine());
 * String line = scan.nextLine();
 * String[] parts = line.split(" ");
 * 
 * int[] numbers = new int[N];
 * for (int i = 0; i < N; i++) {
 * numbers[i] = Integer.parseInt(parts[i]);
 * }
 * 
 * int max = numbers[0];
 * int min = numbers[0];
 * 
 * for (int i = 0; i < N; i++) {
 * if (numbers[i] > max) {
 * max = numbers[i];
 * }
 * if (numbers[i] < min) {
 * min = numbers[i];
 * }
 * }
 * 
 * System.out.print(min + " " + max);
 * }
 * }
 */