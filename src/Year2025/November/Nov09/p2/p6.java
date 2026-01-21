package Year2025.November.Nov09.p2;

public class p6 {
    public static void main(String[] args) {
        String input="Java is best Programming Language";
        String[] words= input.split("\\s+");
        String rev="";
        for(int i= words.length-1;i>=0;i--){
            rev=rev+words[i]+" ";
        }
        System.out.println(rev);
    }
}
