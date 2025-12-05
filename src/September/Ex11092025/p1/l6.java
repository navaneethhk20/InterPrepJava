package September.Ex11092025.p1;

public class l6 {
    public static void main(String[] args) {
        String input="tew@#teroi@#ioyrepo@#bdvcnmfd@#";
        String substring = "@#";

        int index=0;
        int count=0;
        while((index=input.indexOf(substring, index))!=-1){
         count++;
         index= index+substring.length();
        }
        System.out.println(count);
    }
}
