package Ex30062025;

public class Lab04 {
    //fizz buzz, 1 to 100, multiple of 3 is fizz, multiple of 5 buzz,multiple of 3&5 fizzbuzz
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" FizzBuzz");
            } else if (i%3==0) {
                System.out.println(i+" FIzz");
            }else if(i%5==0) {
                System.out.println(i+" Buzz");
            }
        }
    }
}
