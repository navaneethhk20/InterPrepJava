package Year2025.December.Dec05.p1;

public class l2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        boolean hasDuplicate= false;

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1; j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    hasDuplicate=true;
                    break;
                }
            }
            if(hasDuplicate){
                break;
            }
        }

        System.out.println(hasDuplicate);

    }
}
