package Year2025.July.Ex252627072025.Part1_String;

public class Lab22 {
    public static void main(String[] args) {
        String input= "abc@#$cde@#$fgh@#$ijk@#$lmo@#$pqr@#$stu@#$wxy@#$z";
        String substring ="@#$";
        int count =0;
        int index=0;
        while((index =input.indexOf(substring,index))!=-1){
            count++;
            index = index+substring.length();

        }
        System.out.println(count);
    }
}
