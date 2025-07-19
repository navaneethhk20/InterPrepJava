package Ex19072025.Part2;

public class Lab03 {
    public static void main(String[] args){
        //spilt alphabets,Number and special character
        String input = "abc!1234@#@#$";

        StringBuilder alphabets = new StringBuilder();
        StringBuilder numberic = new StringBuilder();
        StringBuilder character = new StringBuilder();

        for(char in: input.toCharArray()) {
            if (Character.isAlphabetic(in)) {
                alphabets.append(in);
            } else if (Character.isDigit(in)) {
                numberic.append(in);
            } else {
                character.append(in);
            }
        }

        System.out.println("Alpabets : "+ alphabets);
        System.out.println("Numbers : "+ numberic);
        System.out.println("special charcter : "+ character );
    }
}
