package Ex11082025.Part1;

public class P9 {
    public static void main(String[] args) {
        String input="Hosurukoppalu kumar Navaneeth";
        String[] words = input.split("\\s+");
        String lastword =words[words.length-1];
        StringBuilder sb = new StringBuilder();
        words[words.length-1]=sb.reverse().toString();
        for(int i=0;i<words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}
