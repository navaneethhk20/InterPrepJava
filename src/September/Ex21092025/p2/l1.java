package September.Ex21092025.p2;

public class l1 {
    public static void main(String[] args) {
        String input=" Whitefield Nithu Navaneeth  ";
        String[] words= input.trim().split("\\s+");
        String lastword= words[words.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}
