package Ex13072025.String.Part2;

public class Lab08 {
    public static String reverselast(String input){
        String [] words = input.split(" ");
        String lastword = words[words.length-1];
        StringBuilder sb = new StringBuilder(lastword);
        words[words.length-1] = sb.reverse().toString();
        return String.join(" ", words);
    }
    public static void main(String[] args) {
        String input ="I Love Java Programming";
        String output = reverselast(input);
        System.out.println(output);
    }
}
