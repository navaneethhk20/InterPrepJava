package August.Ex20250809.p1;

public class L2 {
    public static void main(String[] args) {
        //reverse a string
        String input="nitha";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
