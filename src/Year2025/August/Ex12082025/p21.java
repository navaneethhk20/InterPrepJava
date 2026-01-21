package Year2025.August.Ex12082025;

public class p21 {
    public static void main(String[] args) {
        int [] arr={44,45,46,47,49,50};
        int n=arr.length+1;
        int start=arr[0];
        int actual=0;
        int exp =n*(2*start+n-1)/2;

        for(int num:arr){
            actual=actual+num;
        }

        int missing= exp-actual;
        System.out.println(missing);
    }
}
