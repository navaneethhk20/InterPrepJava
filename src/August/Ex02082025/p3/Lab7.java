package August.Ex02082025.p3;

public class Lab7 {
    public static void main(String[] args) {
        //multiply and divide
        int[] arr={1,2,3,4};
        int product=1;
        for(int num:arr){
            product=product*num;
        }
        for (int num:arr){
            System.out.print(product/num+" ");
        }
    }
}
