package Year2025.October.Oct13.p3;

public class l8 {
    public static void main(String[] args) {
        int num=5847;
        int rev=0;
        while (num!=0){
            int rem= num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
