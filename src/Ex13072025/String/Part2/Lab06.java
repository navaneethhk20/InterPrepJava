package Ex13072025.String.Part2;

public class Lab06 {
    public static void main(String[] args) {

            String input = "abcd@#$123";

            StringBuilder alphabets = new StringBuilder();
            StringBuilder numbers = new StringBuilder();
            StringBuilder specialChars = new StringBuilder();

            System.out.println("Input: " + input);
            System.out.println("Processing each character:");

            for (char ch : input.toCharArray()) {
                System.out.print("'" + ch + "' -> ");

                if (Character.isLetter(ch)) {
                    alphabets.append(ch);
                    System.out.println("Letter");
                } else if (Character.isDigit(ch)) {
                    numbers.append(ch);
                    System.out.println("Number");
                } else {
                    specialChars.append(ch);
                    System.out.println("Special Character");
                }
            }

            System.out.println("\nResults:");
            System.out.println("Alphabets: " + alphabets.toString());
            System.out.println("Numbers: " + numbers.toString());
            System.out.println("Special Characters: " + specialChars.toString());
        }

}
