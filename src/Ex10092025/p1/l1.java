package Ex10092025.p1;

public class l1 {
    public static void main(String[] args) {
        int [] arr={45,46,48,49,50};
        int n=arr.length+1;
        int start=arr[0];
        int exp=n*(2*start+n-1)/2;
        int actual=0;
        for(int num:arr){
            actual=actual+num;
        }
        int diff=exp-actual;
        System.out.println(diff);
    }
}
