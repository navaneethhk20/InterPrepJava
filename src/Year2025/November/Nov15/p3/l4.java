package Year2025.November.Nov15.p3;

public class l4 {
    public static void main(String[] args) {
        int [] arr={11,22,43,6,47,585,7,65,64,3,4,41,57,7};
        int target=64;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" is equal to "+arr[i]+" and "+arr[j]+" present at "+i+" and "+j);
                }
            }
        }
    }
}
