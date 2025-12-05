package September.Ex16092025.p3;

public class l8 {
    public static void main(String[] args){
        int[] arr={2,5,4,8,9,6,1};
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

        int diff= max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(diff);
    }
}
