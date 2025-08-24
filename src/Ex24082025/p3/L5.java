package Ex24082025.p3;

public class L5 {
    public static void main(String[] args) {
        int [] arr={53,543,654,76,54,342,144,586,543,241,387,463,595,443,442,445,642,745,244,346,432,432};

        int target=730;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" and "+j);
                }
            }
        }
    }

}
