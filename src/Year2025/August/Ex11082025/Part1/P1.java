package Year2025.August.Ex11082025.Part1;

public class P1 {
    public static void main(String[] args){
        String input ="navaneeth";
        String rev ="";
        for(int i=input.length()-1;i>=0;i--){
            rev=rev+input.charAt(i);
        }
        System.out.println(rev);
    }
}
