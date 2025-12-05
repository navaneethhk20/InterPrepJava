package September.Ex21092025.p3;

public class l7 {
    public static void main(String[] args) {
        int[] arr={2,10,4,50,75,8,96,90,87,50,38,2,59,67,8};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
