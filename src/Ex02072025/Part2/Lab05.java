package Ex02072025.Part2;

public class Lab05 {
    //Sum of an array
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
