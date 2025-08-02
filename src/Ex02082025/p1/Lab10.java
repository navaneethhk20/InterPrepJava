package Ex02082025.p1;

public class Lab10 {
    public static void main(String[] args) {
        //convert name to initials
        String input ="HosuruKoppalu Kumar Navaneeth";
        String[] words = input.trim().split("\\s+");
        String lastword =words[words.length-1];

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append("").append(lastword);
        System.out.println(sb.toString());
    }
}
