package Ex252627072025.Part1_String;

public class Lab13 {
    public static void main(String[] args){
        //Reverse the string keep the spaces
        String input ="I Love Java Programming";
        String[] words = input.split("\\s+");
        String rev ="";
        for(int i = words.length-1;i>=0;i--){
            rev =rev+words[i]+" ";
        }
        System.out.println(rev);
    }
}
