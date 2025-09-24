package Ex252627072025.Part3_General.P1;

public class Lab08 {
    public static void main(String[] args) {
        int row=10;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row- i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
