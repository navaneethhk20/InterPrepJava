package August.July.Ex19072025And20072025.String.Part2;

public class Lab02 {
    public static void main(String[] args) {
        //Full name to initals
        String input = "Hosurukoppalu Kumar Navaneeth";
        //output="H.K.Navaneeth"
        String[] words = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {

            sb.append((words[i]).charAt(0)).append(".");
        }
        sb.append(" ").append(words[words.length-1]).toString();
        System.out.println(sb);
    }
}
