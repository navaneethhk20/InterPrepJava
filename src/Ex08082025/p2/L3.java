package Ex08082025.p2;

public class L3 {
    public static void main(String[] args) {
        //find duplicates
        int [] arr={1,2,3,1,4,5,6,7,8,9,5,4,8};
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}
