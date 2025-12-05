package August.July.Ex30072025;

public class Lab06 {
    public static void main(String[] args){
        String input= "abc@#$cde@#$fgh@#$ijk@#$lmo@#$pqr@#$stu@#$wxy@#$z";
        String substring="@#$";
        int count=0;
        int index=0;
        while ((index = input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}
