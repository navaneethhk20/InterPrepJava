package Ex20250927.p3;

public class l1 {
    public static void main(String[] args) {
        int[] arr={42,543,6,5,868,97,6545,32,34,5667,7867,432,54,4,34,56,67,76,89,889,432,67,56};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
