package Year2025.Sep.Ex16092025.p3;

public class l1 {
    public static void main(String[] args) {
        int [] arr={534,65,7567,8678,7978,76,54,65,632,5324,3412,3,42,21,34124,35,3,45,46457,6,5,765,8678,685,645,6324,2142,131,2,124,32,432,54,34,54,5,46,565};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i] +" is present at the indecis "+i+" and "+j);
                }
            }
        }
    }
}
