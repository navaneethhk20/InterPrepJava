package August.Ex02082025.p1;

public class Lab7 {
    public static void main(String args[]){
        //count of substring
        String input ="abc@#$def@#$ghi@#$jkl@#$mno@#$pqr@#$stu@#$vwx@#$yz";
        String substring="@#$";
        int index=0;
        int count=0;
        while((index = input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}
