package Year2025.October.Oct01.p5;

public class l6 {
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

        for (int i = 0; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
