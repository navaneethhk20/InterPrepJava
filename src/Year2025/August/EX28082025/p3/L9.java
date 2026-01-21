package Year2025.August.EX28082025.p3;

public class L9 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int product=1;
        for(int num:arr){
            product=product*num;
        }
        for(int num:arr){
            System.out.print(product/num+" ");
        }
    }
}
