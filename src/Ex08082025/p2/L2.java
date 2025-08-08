package Ex08082025.p2;

public class L2 {
    public static void main(String[] args) {
        //find missing
        int[] arr={1,2,3,4,6,7};
        int n= arr.length+1;
        int expect=n*(n+1)/2;
        int actual=0;
        for(int num:arr){
            actual= actual+num;
        }
        int missing= expect-actual;
        System.out.println(missing);
    }
}
