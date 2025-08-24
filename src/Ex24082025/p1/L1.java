package Ex24082025.p1;

public class L1 {
    public static void main(String[] args) {
        String input="bottle";
        String rev="";
        for(int i=input.length()-1;i>=0;i--) {
            rev = rev + input.charAt(i);
        }
         System.out.println(rev);
    }
}
