package November.Nov03.p3;

public class l4 {
    public static void main(String[] args) {
        int[] arr={23,54,6,8,98,423,12,12,43,56,67,87,817,76,56,45,34,3};
int target=110;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}
