package November.Nov15.p3;

public class l5 {
    public static void main(String[] args) {
        int [] arr={11,22,43,6,47,585,7,65,64,3,4,41,56,7};
        int max=arr[0];
        int min=arr[0];

        int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }

        for(int j=0;j<index;j++){
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
