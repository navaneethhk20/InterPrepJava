package Year2025.August.Ex21082025.p1;

public class L6 {
    public static void main(String[] args) {
        String input="gd@#$ter234gdfs234gfdkj234kjged234oijter234";
        String subset="234";
        int count=0;
        int index=0;
        while((index=input.indexOf(subset, index))!=-1){
            count++;
            index=index+subset.length();
        }
        System.out.println(count);
    }
}
