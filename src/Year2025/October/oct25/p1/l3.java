package Year2025.October.oct25.p1;

public class l3 {
    public static void main(String[] args) {
        String input = "I Love Java Programming";
        String rev = "";
        String[] words = input.trim().split("\\s+");

        for (int i=words.length-1;i>=0;i--){
            rev=rev+words[i]+" ";
        }
        System.out.println(rev);
    }

}
