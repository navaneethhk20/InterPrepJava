package October.oct29.p2;

public class l4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int product=1;
        for(int num:arr){
            product=product*num;
        }
        for(int arra:arr){
            System.out.print(product/arra+" ");
        }
    }
}
