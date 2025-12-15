package December.Dec15.p3;

public class l1 {
    public static void main(String[] args) {
        int[] arr={11,22,54,35,17,28,29,92,38,364,674,47,93,94,75,674,82,9,92};
        int max=arr[0];
        int min=arr[0];
int index=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>max){
                max= arr[i];
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
