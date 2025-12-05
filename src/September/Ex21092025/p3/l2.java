package September.Ex21092025.p3;

public class l2 {
    public static void main(String[] args) {
        int[] arr={22,10,44,50,75,80,96,90,87,50,38,20,59,67,18};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at the indecis "+i+" and "+j);
                }
            }
        }
    }
}
