package October.oct29.p3;

public class l10 {
    public static void main(String[] args) {
        String input="Nith Hosuru Magge";
        String[] words= input.split("\\s+");
        String largest= words[0];
        String smallest =words[0];
        for(int i=0;i<= words.length-1;i++) {
            if(words[i].length()>largest.length()){
                largest=words[i];
            }
        }
        for(int j=0;j<= words.length-1;j++){
            if(words[j].length()<smallest.length()){
                smallest=words[j];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
