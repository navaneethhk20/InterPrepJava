package July.Ex252627072025.Part2_Arrays;

public class Lab15 {
    public static void main(String[] args) {
        //print the indesis of common elements in an array
        int []arr={1,2,1,3,4};

        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Element " + arr[i] + " found at indices: " + i + " and " + j);
                }
            }
        }
    }
}
