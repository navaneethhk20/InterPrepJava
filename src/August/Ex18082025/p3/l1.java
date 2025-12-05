package August.Ex18082025.p3;

public class l1 {
    public static void main(String[] args) {
        int [] arr={5,542,254,54,87,89,89,65,21,54,4889,65,2,51,45,4,856,25,4};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i] +" duplicate are present at "+i+" and "+j);
                }
            }
        }
    }
}
