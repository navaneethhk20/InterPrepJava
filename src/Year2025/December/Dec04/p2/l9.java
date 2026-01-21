package Year2025.December.Dec04.p2;

public class l9 {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,23,9,8,77,66,55,43,1};
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
