package Year2025.July.Ex252627072025.Part2_Arrays;

public class Lab17 {
    public static void main(String[] args) {
        //output: {120,24,12,8,6}
        int[] arr = {1, 2, 3, 4,5};
        int totalProduct = 1;

        for (int num : arr) {
            totalProduct = totalProduct*num;
        }

        for (int num : arr) {
            System.out.print((totalProduct / num)+" ");
        }
    }
}
