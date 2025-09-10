package Ex10092025.p2;

public class l1 {
    public static void main(String[] args) {
        int [] arr={4,6,8,2,4,9,1};
        int max=arr[0];
        int min=arr[0];
        int index=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        for(int i=0;i<=index;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int diff= max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(diff);
    }
}
