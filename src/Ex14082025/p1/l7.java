package Ex14082025.p1;

public class l7 {
    public static void main(String[] args) {
        int[] arr={5,6,8,5,2,6,4,8};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}
