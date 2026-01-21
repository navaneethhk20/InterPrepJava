package Year2025.Sep.Ex09092025;

public class l7 {
    public static void main(String[] args) {
        String input="I Love Java Prograaming";
        String []words=input.split("\\s+");
        String lastword= words[words.length-1];
        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1]= sb.reverse().toString();
        System.out.println(String.join(" ", words));
    }
}
