package July.Ex252627072025.Part2_Arrays;

public class Lab01 {
    public static void main(String[] args) {
        //  Find max and min in an array
        int[] arr={4,3,2,23,5,6,1,2,11,33,44,55,66,43,12,54,53,76,87,56,76};
        int max= arr[0];
        int min=arr[0];

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);

        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
