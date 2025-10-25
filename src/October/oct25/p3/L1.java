package October.oct25.p3;

public class L1 {
    public static void main(String[] args) {
        int[] arr={23,45,65,67,54,43,32,54,67,89,67,4,5667,2};
        int max=arr[0];
        int min=arr[0];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }

        for(int j=0;j<=index;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int diff = max-min;
        System.out.println(diff);
    }
}
