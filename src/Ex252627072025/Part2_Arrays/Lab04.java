package Ex252627072025.Part2_Arrays;

public class Lab04 {
    public static void main(String[] args) {
        //Sum of an array
        int [] arr ={1,2,3,4,5,6};
        int sum=0;
        for(int i=0;i<= arr.length-1;i++){
             sum =sum+arr[i];
        }
        System.out.println(sum);
    }
}
