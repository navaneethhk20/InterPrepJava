package December.Dec31.p1;

public class l7 {
    public static void main(String[] args) {
        int[] arr={4,8,7,4,6,252,13,11,22,5,9,8,7,44,8,855,77,44,22,66,3,22,1};
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
        int diff=max-min;
        System.out.println(diff);
    }
}
