package Year2025.December.Dec10.p3;

public class l2 {
    public static void main(String[] args) {
        int[] arr={12,31,25,63,84,56,64,83,22,52,22,436,49,58,66,5732,81,29,263,33,5};

        int max=arr[0];
        int min=arr[0];
        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);

        for(int j=0;j<=index;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(min);

        int diff= max-min;
        System.out.println(diff);
    }
}
