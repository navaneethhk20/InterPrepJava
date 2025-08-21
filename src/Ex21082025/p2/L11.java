package Ex21082025.p2;

public class L11 {
    public static void main(String[] args) {
        int [] arr={4,5,2,6,9};
        int target=8;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("indecis present at "+i+" and "+j);
                }
            }
        }
    }
}
