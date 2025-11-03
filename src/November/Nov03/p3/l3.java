package November.Nov03.p3;

public class l3 {
    public static void main(String[] args) {
        int[] arr={23,54,6,8,98,423,12,12,43,56,67,87,817,76,56,45,34,3};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i] ==arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
