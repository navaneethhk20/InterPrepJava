package August.Ex24082025.p3;

public class L6 {
    public static void main(String[] args) {
        int [] arr={53,543,654,76,54,342,144,586,543,241,387,463,595,443,442,445,642,745,244,346,32,432};
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
