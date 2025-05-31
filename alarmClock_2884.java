import java.util.Scanner;

public class alarmClock_2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String time = scan.nextLine();

        String[] splitTime = time.split(" ");
        int[] intTime = new int[2];

        for (int i = 0; i < 2; i++) {
            intTime[i] = Integer.parseInt(splitTime[i]);
        }

        int totalTime = intTime[0] * 60 + intTime[1];
        int alarmOffset = totalTime - 45;

        if (alarmOffset < 0) {
            alarmOffset = alarmOffset + 1440;
        }

        System.out.println(alarmOffset / 60 + " " + alarmOffset % 60);
    }
}
