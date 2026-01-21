package Year2025.August.July.Strings;

public class ReverseLastWordOfAAstring {
    public static String reverseString(String input) {
        String[] words = input.split(" ");

        String lastword = words[words.length - 1];
        StringBuilder reverse = new StringBuilder(lastword);
        words[words.length - 1] = reverse.reverse().toString();
        return String.join( " ", words);

    }

    public static void main(String[] args){
        String input = "I Love Java Programming";
        String output = reverseString(input);
        System.out.println(input);

        System.out.println(output);

    }
}


