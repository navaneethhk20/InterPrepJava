package Year2025.August.Ex08082025.p1;

public class L19 {
    public static void main(String[] args) {
        //reverse a number
        int num=54;
        int rev=0;
        while(num!=0){
            int rem= num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
