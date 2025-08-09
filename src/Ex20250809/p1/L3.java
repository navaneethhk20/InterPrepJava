package Ex20250809.p1;

public class L3 {
    public static void main(String[] args) {
        String input ="I Love Java Programming";
        String[] words=input.split("\\s+");
        String lsastword= words[words.length-1];
        StringBuilder sb = new StringBuilder(lsastword);
        words[words.length-1]= sb.reverse().toString();
        System.out.println(String.join(" ", words));
    }
}
