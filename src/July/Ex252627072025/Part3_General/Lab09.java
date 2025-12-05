package July.Ex252627072025.Part3_General;

public class Lab09 {
    public static void main(String[] args){
        //Reverse a number
        int number=1234;
        int rev=0;
        while(number!=0){
            int rem = number%10;
            rev = rev*10+rem;
            number=number/10;
        }
        System.out.println(rev);
    }
}
