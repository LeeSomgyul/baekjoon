import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigDecimal a = scan.nextBigDecimal();
        BigDecimal b = scan.nextBigDecimal();

        BigDecimal result = a.divide(b, 34, RoundingMode.HALF_UP);
        System.out.println(result.toPlainString());
    }
}