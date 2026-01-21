package Year2025.November.Nov15.p5;

public class l10 {
    public static void main(String[] args) {
        String input="nithu hosurukoppalu market test";
        String[] words=input.split("\\s+");
        String maxlengthstring=words[0];
        String minlengthstring=words[0];

        for(int i=0;i<= words.length-1;i++) {
            if (words[i].length()>maxlengthstring.length()){
                maxlengthstring=words[i];
            }

        }

        for(int j=0;j<= words.length-1;j++) {
            if (words[j].length()<minlengthstring.length()){
                minlengthstring=words[j];
            }

        }



        System.out.println(maxlengthstring.length());
        System.out.println(minlengthstring.length());
    }
}
