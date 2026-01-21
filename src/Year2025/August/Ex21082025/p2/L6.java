package Year2025.August.Ex21082025.p2;

public class L6 {
    public static void main(String[] args) {
        int [] arr={654,64,76,86,987,3,243,41,45,67897,654,32,1,65,45,6789,65432,1,444487965,43,21,5,4566675,4};

        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" is present at "+i+" and "+j);
                }
            }
        }
    }
}
