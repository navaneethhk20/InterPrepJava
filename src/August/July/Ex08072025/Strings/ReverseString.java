package August.July.Ex08072025.Strings;

public class ReverseString{

    public static String reverseAndSwapCase(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Let's trace through the example step by step
        // Input: "I Am Not String"
        // Positions: 0123456789...
        // Expected: "g ni rtS toNmAI"

        StringBuilder result = new StringBuilder();

        // Go through string backwards
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);

            // The pattern seems to be: reverse + swap case
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else {
                result.append(c); // spaces and other chars stay the same
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "I Am Not String";
        String output = reverseAndSwapCase(input);

        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
        System.out.println("Expected: \"g ni rtS toNmAI\"");

        // Let's debug step by step
        System.out.println("\nStep by step analysis:");
        System.out.println("Original: " + input);
        System.out.println("Length: " + input.length());

        for (int i = 0; i < input.length(); i++) {
            char original = input.charAt(i);
            char reversed = input.charAt(input.length() - 1 - i);
            char swapped = swapCase(reversed);
            System.out.println("Pos " + i + ": '" + original + "' -> reverse[" + (input.length() - 1 - i) + "] = '" + reversed + "' -> swap = '" + swapped + "'");
        }
    }

    private static char swapCase(char c) {
        if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        } else if (Character.isUpperCase(c)) {
            return Character.toLowerCase(c);
        } else {
            return c;
        }
    }
}