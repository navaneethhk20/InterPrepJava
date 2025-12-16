package December.Dec16.p2;

public class l10 {
    public static void main(String[] args) {
        String input="nithu hosuru koapp thu";
        String [] words= input.split("\\s+");
        String maxlengthword=words[0];
        String minlengthword=words[0];

        for(int i=0;i<= words.length-1;i++){
            if(maxlengthword.length()>words[i].length()){
                maxlengthword=words[i];
            }
        }

        for(int i=0;i<= words.length-1;i++){
            if(minlengthword.length()<words[i].length()){
                minlengthword=words[i];
            }
        }
        System.out.println(maxlengthword.length());
        System.out.println(minlengthword.length());

    }
}
