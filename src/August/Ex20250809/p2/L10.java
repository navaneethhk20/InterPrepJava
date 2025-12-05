package August.Ex20250809.p2;

public class L10 {
    public static void main(String[] args) {
        //find max & min
        //find diff of max & min, condition,min should be left of max
        int []arr={3,4,6,8,7,55,66,22,11,44,33,36,47,69,5,32,2};
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
        System.out.println(max-min);
    }
}
