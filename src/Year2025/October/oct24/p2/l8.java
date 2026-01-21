package Year2025.October.oct24.p2;

public class l8 {
    public static void main(String[] args) {
        String input="I Love Java Prograaming";
        String[] words= input.trim().split("\\s+");
        String lastword= words[words.length-1];
        StringBuilder sb= new StringBuilder(lastword);
        words[words.length-1]=sb.reverse().toString();
        System.out.println(String.join(" ", words));
    }
}
