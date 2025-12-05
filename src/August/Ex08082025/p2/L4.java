package August.Ex08082025.p2;

public class L4 {
    public static void main(String[] args) {
        //find indecies who's value is equal to target
        int target=4;
        int [] arr={1,2,3,1,4};
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" is values indeces are present at "+i+" and "+j);
                }
            }
        }
    }
}
