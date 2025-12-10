package December.Dec10.p2;

public class l6 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int product = 1;
        for(int ar:arr){
           product=product*ar ;
        }

        for(int ar: arr){
            System.out.print(product/ar+ " ");
        }

    }
}
