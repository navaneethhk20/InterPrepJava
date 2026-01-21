package Year2025.August.Ex02082025.p3;

public class Lab5 {
    public static void main(String[] args) {
        //find the missing array
        int [] arr1={1,2,4,5,6};
        int n=arr1.length+1;
        int expected=n*(n+1)/2;
        int actual=0;

        for(int num:arr1){
            actual=actual+num;
        }
        int missing= expected-actual;
        System.out.println(missing);
    }
}
