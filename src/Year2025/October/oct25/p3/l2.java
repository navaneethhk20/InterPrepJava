package Year2025.October.oct25.p3;

public class l2 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int product=1;
        for(int num:arr){
            product=product*num;
        }
        for (int num:arr){
            System.out.print(product/num+" ");
        }
    }
}
