package Ex19072025.Part3;

public class Lab03 {
    public static void main(String[] args) {
        String input ="HexAWarE";
        // output="hEXawARe";
        StringBuilder sb = new StringBuilder();
        for(char ch: input.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else {
                sb.append(ch);
            }
        }
            System.out.println(input);
            System.out.println(sb.toString());
    }
}
