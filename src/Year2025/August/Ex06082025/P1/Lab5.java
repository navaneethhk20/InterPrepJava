package Year2025.August.Ex06082025.P1;

public class Lab5 {
    public static void main(String[] args) {
        String input= "I Love Java Programming";
        String[] words = input.split("\\s+");
        String rev="";
        for(int i= words.length-1;i>=0;i--){
           rev=rev+words[i]+" ";
        }
        System.out.println(rev);
    }
}
