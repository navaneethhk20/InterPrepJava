package Ex06082025.P1;

public class Lab3 {
    public static void main(String[] args) {
        //name to initials
        String name="Kadugodi Tree Park Whitefield";

        String[] words = name.split("\\s+");
        String lastword =words[words.length-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< words.length-1;i++){
            sb.append(words[i].charAt(0)).append(".");
        }
        sb.append(" ").append(lastword);
        System.out.println(sb.toString());
    }
}
