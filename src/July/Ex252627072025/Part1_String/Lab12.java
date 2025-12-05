package July.Ex252627072025.Part1_String;

public class Lab12 {
    public static void main(String[] args) {
        //Reverse the last word in an input
        String input = "I Love Java Programming";
        String[] words = input.split("\\s+");
        String lastword = words[words.length-1];

        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1] = sb.reverse().toString();

        System.out.println(String.join(" ",words));
    }
}
