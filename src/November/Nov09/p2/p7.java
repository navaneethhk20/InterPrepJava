package November.Nov09.p2;

public class p7 {
    public static void main(String[] args) {
        String input="Today is Monday";
        String[] words= input.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(String word: words){
            StringBuilder reverseword = new StringBuilder(word);
            reverseword.reverse();
            sb.append(reverseword).append(" ");
        }
        System.out.println(sb.toString());
    }
}
