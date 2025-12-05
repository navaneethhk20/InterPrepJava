package July.Ex252627072025.Part2_Arrays;

public class Lab14 {
    //Missin element from array
    public static void main(String[] args) {
        int [] arr= {1,2,4,5,6};
        int n= arr.length+1;
        int expectedsum =n*(n+1)/2;
        int actaulsum =0;

        for(int num:arr){
          actaulsum =actaulsum+num;
        }
        int missing =expectedsum-actaulsum;

        System.out.println(missing);
    }
}
