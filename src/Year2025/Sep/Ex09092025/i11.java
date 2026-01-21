package Year2025.Sep.Ex09092025;

public class i11 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int product=1;
        for(int num: arr){
            product=product*num;
        }
        for(int num:arr){
            System.out.print(product/num+" ");
        }
    }
}
