package Year2025.Sep.Ex08092025.p2;

public class l1 {
    public static void main(String[] args) {
        String input="hghg@#ghg#uyuy&^$#@ghgh@#";
        String substring="@#";
        int count=0;
        int index=0;
        while((index= input.indexOf(substring, index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}
