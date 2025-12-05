package August.Ex08082025.p1;

public class L2 {
    public static void main(String[] args){
        //reverse string with sb and without
        String input ="nithu";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
