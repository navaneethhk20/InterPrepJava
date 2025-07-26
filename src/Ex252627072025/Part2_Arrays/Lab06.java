package Ex252627072025.Part2_Arrays;

public class Lab06 {
    public static void main(String[] args) {
        //inverted pyramid
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
