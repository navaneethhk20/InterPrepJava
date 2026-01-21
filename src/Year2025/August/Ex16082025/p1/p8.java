package Year2025.August.Ex16082025.p1;

public class p8 {
    public static void main(String[] args) {
        String input="abs423tre423uty423oiu423oiu423";
        String subs="23";
        int index=0;
        int count=0;
        while((index = input.indexOf(subs,index))!=-1){
        count++;
        index= index+subs.length();
        }
        System.out.println(count);
    }
}
