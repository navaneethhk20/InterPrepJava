package November.Nov03.p3;

public class l5 {
    public static void main(String[] args) {
        int[] arr={23,54,6,8,98,423,2,12,43,56,67,87,817,76,56,45,34,1};

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
