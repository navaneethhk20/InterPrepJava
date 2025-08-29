package EX28082025.p3;

public class L4 {
    public static void main(String[] args) {
        int[] arr={4,5,2,9,4,8,1};
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
        for(int i=0;i<=index;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        int diff=max-min;
        System.out.println(diff);
    }
}
