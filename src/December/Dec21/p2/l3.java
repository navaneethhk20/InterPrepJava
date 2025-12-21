package December.Dec21.p2;

public class l3 {
    public static void main(String[] args) {
        String input="Rama Nagari White Field";
        String[] words = input.split("\\s+");
        String rev="";
        for(int i= words.length-1;i>=0;i--){
            rev=rev+words[i]+" ";
        }
        System.out.println(rev);
    }
}
