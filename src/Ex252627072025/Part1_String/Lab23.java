package Ex252627072025.Part1_String;

public class Lab23 {
    public static void main(String[] args) {
        //print index of common character in a string
        String name="dodo";
        for(int i = 0; i < name.length(); i++) {
            for(int j = i+1; j < name.length(); j++) {
                if(name.charAt(i) == name.charAt(j)) {
                    System.out.println("Character '" + name.charAt(i) + "' found at indices: " + i + " and " + j);
                }
            }
        }
    }
}
