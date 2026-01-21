package Year2025.August.July.Strings;

public class NameToInitials {

    public static String nametoInitial(String input){
        String [] words = input.trim().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (int i=0;i<words.length-1;i++){
            result.append(words[i].charAt(0)).append(".");
        }
        result.append(" ").append(words[words.length-1]);

        return result.toString() ;
    }
    public static void main(String[] args) {
        String input = "Hosurukoppalu Kumar Navaneeth";
        //String output = "H.K. Navaneeth";
        String output = nametoInitial(input);
        System.out.println(input);
        System.out.println(output);
    }
}
