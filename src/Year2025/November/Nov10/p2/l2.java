package Year2025.November.Nov10.p2;

public class l2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int product=1;
        for(int num:arr){
            product=product*num;
        }

        for(int num1:arr){
            System.out.print(product/num1+" ");
        }
    }
}
