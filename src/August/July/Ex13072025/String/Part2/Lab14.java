package August.July.Ex13072025.String.Part2;

public class Lab14 {

    public static String reverse(String input){
        String[] words = input.split(" ");
        String result="";
        for (int i= words.length-1;i>=0;i--){
            result = result+words[i]+" ";
        }
        return result;
    }

    public static void main(String[] args) {
        String input ="I love bangalore";
        String output =reverse(input);
        System.out.println(output);
    }
}
