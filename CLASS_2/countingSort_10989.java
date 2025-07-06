import java.io.BufferedReader;
import java.io.InputStreamReader;

public class countingSort_10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            arr[input]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10001; i++) {
            while (arr[i] > 0) {
                sb.append(i).append("\n");
                arr[i]--;
            }
        }

        System.out.print(sb);

    }
}
