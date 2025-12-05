package August.Ex06082025.p3;

public class Lab6 {
    public static void main(String[] args) {
        String input="asdf@#$GHJ@#$ghjk@#$KLJK@#$cvbn@#$yui@#$";
        String substring="@#$";
        int count=0;
        int index=0;
        while((index= input.indexOf(substring, index))!=-1){
            count++;
            index= index+substring.length();
        }
        System.out.println(count);
    }
}
