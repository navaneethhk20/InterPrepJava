package December.Dec31.p1;

public class l2 {
    public static void main(String[] args) {
        String input="Coffee Bean Magge";
        StringBuilder sb = new StringBuilder();
        String[] words=input.split("\\s+");
         String lastword= words[words.length-1];
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}
