package November.Nov06.p2;

public class l7 {
    public static void main(String[] args) {
        int[] arr={423,54,75,68,675,43,234,1231,2,33,12,65,432,3,65,65,787,6};
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
