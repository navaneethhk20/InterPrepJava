package August.Ex12082025;

public class p23 {
    public static void main(String[] args) {
        int [] arr={4,5,2,3,4,6,7,8,2};

        for(int i=0;i<=arr.length-1;i++){
            for (int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}
