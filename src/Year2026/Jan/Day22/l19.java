package Year2026.Jan.Day22;

public class l19 {
    public static void main(String[] args) {
        int[] arr={12,24,54,75,78,96,74,253,23,12,32,66,56,27,38,59,998,97,7,426,54,34,43};
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
        int diff= max-min;
        System.out.println(diff);
    }
}
