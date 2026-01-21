package Year2025.November.Nov16.p1;

public class l4 {
    public static void main(String[] args) {
        String input="Java Program is not easy";

        String[] words= input.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<=words.length-1;i++){
            StringBuilder sb1= new StringBuilder(words[i]);
            sb.append(sb1.reverse());

            if(i< words.length-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
