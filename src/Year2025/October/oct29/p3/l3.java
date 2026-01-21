package Year2025.October.oct29.p3;

public class l3 {
    public static void main(String[] args) {
        int[] arr={43,654,7,87,34,324,6,765,87,879,43,32,21,432,65,6778,87987,654,343};

        int target=439;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" and "+j);

                }
            }
        }
    }
}
