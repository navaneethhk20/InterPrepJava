package Year2025.August.Ex2508202526082025.P1;

public class L11 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int prod=1;
        for(int num:arr){
            prod=prod*num;
        }

        for(int num: arr){
            System.out.print(prod/num+" ");
        }
    }
}
