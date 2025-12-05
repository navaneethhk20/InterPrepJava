package August.Ex24082025.p2;

public class L3 {
    public static void main(String[] args) {
        String input="I Love Java Programming";
        String[] words = input.split("\\s+");
        String lastowrd = words[words.length-1];
        StringBuilder sb = new StringBuilder(lastowrd);
        words[words.length-1]= sb.reverse().toString();
        System.out.println(String.join(" ",words));

    }
}
