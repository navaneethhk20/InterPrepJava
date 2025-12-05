package August.July.Ex19072025And20072025.Arrays;

public class Lab06 {
    public static void main(String[] args) {
        //Find missing number in an array
        int[] arr1 = {1,2,3,4,6,7,8,9};
        
        int n = arr1.length + 1; 
        
        int expectedSum = n * (n + 1) / 2;
        
        int actualSum = 0;

        for(int num : arr1) {
            actualSum =actualSum+ num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);

    }
}
