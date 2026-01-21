package Year2025.October.Oct01.p1;

public class l1 {
    public static void main(String[] args){
        String input="madam";
        StringBuilder sb= new StringBuilder(input);
        String rev= sb.reverse().toString();
        System.out.println(rev);
        if(input.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
}
