package Year2025.November.Nov11.p2;

public class L1 {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 0; i <= num; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static Boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        if (number == 2) {
            return true;
        }

        if (number % 2 == 0) {
            return false;
        }

        for (int i = 3; i *i<= number; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
