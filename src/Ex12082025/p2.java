package Ex12082025;

public class p2 {
    public static void main(String[] args) {
        String input ="finished";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
