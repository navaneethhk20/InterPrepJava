package Year2025.December.Dec11;

public class l2 {
    public static void main(String[] args) {
        String input="Nithu can meet with people of care";
        String[] words=input.split("\\s+");
        String maxlength=words[0];
        String minlength=words[0];

        for(int i= 0;i<= words.length-1;i++){
            if(words[i].length()>maxlength.length()){
                maxlength=words[i];
            }
        }

        for(int i=0;i<= words.length-1;i++){
            if(words[i].length()<minlength.length()){
                minlength=words[i];
            }
        }

        System.out.println(maxlength);
        System.out.println(minlength);
    }
}
