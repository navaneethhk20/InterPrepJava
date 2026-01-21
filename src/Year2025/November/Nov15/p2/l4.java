package Year2025.November.Nov15.p2;

public class l4 {
    public static void main(String[] args) {
        String input="I Love Java Programming";
        String[] word= input.split("\\s+");
        String lastword= word[word.length-1];
        StringBuilder sb = new StringBuilder(lastword);
        word[word.length-1]=sb.reverse().toString();
        System.out.println(String.join(" ",word));
    }
}
