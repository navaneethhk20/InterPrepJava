package October.oct24.p1;

public class l5 {
    public static void main(String[] args) {
        int [] arr={43,6,87,98,9,67,56,45,34,32,435,6,76,87,8,8967,34,5,54,4,43,456,3};
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
