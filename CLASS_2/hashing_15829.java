import java.util.Scanner;

public class hashing_15829 {

    // 🔥large버전(Math.pow는 double형으로 계산하여 큰 정수형 숫자를 계산할수록 소수점에 대한 오차가 발생함.)
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        scan.nextLine();

        String S = scan.next();
        long result = 0;
        long pow = 1;

        for (int i = 0; i < N; i++) {
            int ch = S.charAt(i) - 'a' + 1;
            result = (result + ch * pow) % 1234567891;
            pow = (pow * 31) % 1234567891;
        }

        System.out.println(result);

    }

    /*
     * //🔥small버전(Math.pow 사용)
     * public static void main(String[] args) {
     * Scanner scan = new Scanner(System.in);
     * 
     * int N = scan.nextInt();
     * scan.nextLine();
     * 
     * String S = scan.next();
     * int result = 0;
     * 
     * for (int i = 0; i < N; i++) {
     * int ch = S.charAt(i) - 'a' + 1;
     * result += ch * Math.pow(31, i);
     * }
     * 
     * System.out.println(result);
     * 
     * }
     */
}
