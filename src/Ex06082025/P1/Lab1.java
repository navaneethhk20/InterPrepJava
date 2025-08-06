package Ex06082025.P1;

public class Lab1 {
    public static void main(String[] args) {
        String input ="abc@#$def@#$ghi@#$jkl@#$mno@#$pqr@#$%stu@#$vwz";
        String substring="@#$";
        int index=0;
        int count=0;
        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);

    }
}
