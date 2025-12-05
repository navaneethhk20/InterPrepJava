package August.July.Ex02072025.Part2;

public class Lab02 {
        //Find max and min in an Array
    public static int giveMax() {
        int[] arr = {45, 8, 24, 7, 9, 6, 6, 97, 4, 46, 87, 325, 458, 5, 478, 458, 56};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int giveMin() {
        int[] arr = {45, 8, 24, 7, 9, 6, 6, 97, 4, 46, 87, 325, 458, 5, 478, 458, 56};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(giveMin());
        System.out.println(giveMax());
    }
}
