package November.Nov22.p2;

public class l8 {
    public static void main(String[] args) {
        int [] arr={1,22,43,25,16,57,78,69};
        int target=47;

        for(int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" and "+j);
                }
            }
        }
    }
}
