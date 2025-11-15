package November.Nov15.p1;

public class l1 {
    public static void main(String[] args) {
        String input="madam";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
         rev=rev+input.charAt(i);
        }
        System.out.println(rev);
        if(input.equals(rev)){
            System.out.println("palindorme");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
