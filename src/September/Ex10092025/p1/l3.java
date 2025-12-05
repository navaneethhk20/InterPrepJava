package September.Ex10092025.p1;

public class l3 {
    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,0,8,7,6,5,4,3,2,1};
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println("common element is "+arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}
