package August.Ex2508202526082025.P1;

public class L2 {
    public static void main(String[] args){
        String input="navaneeth";
        String rev="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
