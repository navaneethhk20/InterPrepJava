package August.Ex12082025;

public class p16 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int product=1;

        for(int num:arr){
            product=product*num;
        }
        for (int num:arr){
            System.out.println(product/num+" ");
        }
    }
}
