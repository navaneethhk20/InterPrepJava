package October.Oct10;

public class l15 {
    public static void main(String[] args) {
        int[] arr={23,54,67,98,76,53,42,432,1,123,5,46,57,90,87,534,33,21,1,43,76,8789,54};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i] +" is present at "+i+" and "+j);
                }
            }
        }
    }
}
