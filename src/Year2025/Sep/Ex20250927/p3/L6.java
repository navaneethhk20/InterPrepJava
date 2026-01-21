package Year2025.Sep.Ex20250927.p3;

public class L6 {
    public static void main(String[] args) {
        int[] arr={21,5465,767,376,34,5,31,2,234,3,54,67,23,3,54,665,7,32,4,34,56,6};
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
