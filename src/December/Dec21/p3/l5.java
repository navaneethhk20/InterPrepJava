package December.Dec21.p3;

public class l5 {
    public static void main(String[] args) {
        int [] arr={12,3,43,5,67,32,765,53,323,3233,34,56,76,87,54,1,32,43};
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
        int diff=max-min;
        System.out.println(diff);
    }
}
