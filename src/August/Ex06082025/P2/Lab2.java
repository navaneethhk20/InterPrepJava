package August.Ex06082025.P2;

public class Lab2 {
    public static void main(String[] args) {
        //Find missing
        int[] arr1={1,2,3,5,6,7,8,9};
        int n= arr1.length+1;
        int expected= n*(n+1)/2;
        int actal=0;
        for(int num:arr1){
            actal=actal+num;
        }
        int missing= expected-actal;
        System.out.println(missing);
    }
}
