package Year2025.August.Ex08082025.p2;

public class L1 {
    public static void main(String[] args) {
        int [] arr={4,5,5,6,54,8,6,2,1,41,4,5,21,41,4,58,5,1,4,5,2,1,4,74,7,8,8,8,9,6,6,2,2,1,1,4,44,9,1,11,3};
         int max=arr[0];
         int min=arr[0];
         for(int i=0;i<=arr.length-1;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
         }

         for(int j=0;j<=arr.length-1;j++){
             if(arr[j]<min){
                 min=arr[j];
             }
         }

        System.out.println(max);
        System.out.println(min);
    }
}
