package CLASS_1;

import java.util.Scanner;

public class lessThanX_10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 첫번째 줄 N, X 받기
        String[] firstLine = scan.nextLine().split(" ");

        // N, X를 문자 -> 정수로 변환
        int N = Integer.parseInt(firstLine[0]);
        int X = Integer.parseInt(firstLine[1]);

        // 두번째 줄 배열 N에 대한 값들 받기기
        String[] secondLine = scan.nextLine().split(" ");

        // N 길이만큼 배열 선언
        int[] arr = new int[N];

        // N 배열에 값 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(secondLine[i]);
        }

        // 배열 안의 값에서 X보다 작은 값 출력
        for (int i = 0; i < N; i++) {
            if (arr[i] < X) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
