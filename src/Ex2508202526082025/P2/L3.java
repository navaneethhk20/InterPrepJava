package Ex2508202526082025.P2;

public class L3 {
    public static void main(String[] args) {
        String input ="I Love Java Programming";
        String[] words= input.split("\\s+");
        String rev="";
        for(int i=words.length-1;i>=0;i--){
            rev=rev+words[i]+" ";
        }
        System.out.println(rev);
    }
}
