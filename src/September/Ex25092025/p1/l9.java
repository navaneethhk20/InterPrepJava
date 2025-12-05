package September.Ex25092025.p1;

public class l9 {
    public static void main(String[] args) {
        int[] arr={34,878,98,98,7,6,5,4,34,23,12,32,4,5,6,7,87,8989,54};
        for(int i=0;i<= arr.length-1;i++){
            for(int j=i+1;j<= arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}
