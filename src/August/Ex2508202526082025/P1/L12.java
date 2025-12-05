package August.Ex2508202526082025.P1;

public class L12 {
    public static void main(String[] args) {
        int[] arr={4,6,8,7,6,2};
        int max=arr[0];
        int index=0;

        for(int i=0;i<=arr.length-1;i++){
                if(arr[i]>max){
                    max=arr[i];
                    index=i;
            }
        }
        int min=arr[0];
        for(int j=0;j<=index;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println(max-min);
    }
}
