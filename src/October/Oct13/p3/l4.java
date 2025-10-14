package October.Oct13.p3;

public class l4 {
    public static void main(String[] args) {
        int [] arr={23,54,6,8,90,4,23,594,56,78,98,3,254,65,87,54};
        int target= 71;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(target+" is present at indecis "+i+" and "+j);
                }
            }
        }
    }
}
