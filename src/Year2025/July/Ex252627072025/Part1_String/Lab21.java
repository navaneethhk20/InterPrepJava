package Year2025.July.Ex252627072025.Part1_String;

public class Lab21 {
    public static void main(String[] args) {
        //swap the character in a string
String name= "nith";
char[]  chars = name.toCharArray();

        char temp = chars[0];
        chars[0] = chars[1];
        chars[1] = temp;

        String result = new String(chars);
        System.out.println(result);

    }
}
