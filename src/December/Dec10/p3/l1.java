package December.Dec10.p3;

public class l1 {
    public static void main(String[] args) {
        int[] arr={12,31,25,63,84,56,64,83,22,52,22,436,49,58,66,5732,81,29,263,33,5};

        int target=57;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" is equals to values present at "+i+" and "+j);
                    break;
                }

            }
        }
    }
}
