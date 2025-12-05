package August.Ex20250809.p1;

public class L8 {
    public static void main(String[] args) {
       String input= "Hos@#$uru#$%kopp@#$alun@#$ithu@#$kum@#$armaggehassan@#$karantakabeng@#$alurui@#$ndiaworld";
       String substring="@#$";
       int count=0;
       int index=0;
       while ((index=input.indexOf(substring,index))!=-1){
           count++;
           index=index+substring.length();
       }
        System.out.println(count);
    }
}
