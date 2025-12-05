package August.Ex11082025.Part1;

public class P12 {
    public static void main(String[] args) {
        String input= "I Love Java Programing";
        String [] words= input.split("\\s+");
        String rev="";
        for(int i= words.length-1;i>=0;i--){
            rev=rev+words[i]+" ";
        }
        System.out.println(rev);
    }
}
