package Ex20250927.p4;
import java.util.Scanner;
public class l1 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= number; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
