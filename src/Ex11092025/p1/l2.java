package Ex11092025.p1;

public class l2 {
    public static void main(String[] args){
        String input="nithu";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
