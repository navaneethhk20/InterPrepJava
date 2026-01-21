package Year2025.August.EX28082025.p1;

public class L11 {
    public static void main(String[] args) {
        String input="I Love Java Programming";
        String [] words= input.split("\\s+");
        String lastword= words[words.length-1];
        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1]= sb.reverse().toString();
        System.out.println(String.join(" ", words));
    }
}
