package Ex13072025.String.Part1;

public class Lab09 {
    public static void main(String[] args) {
        //count the number of times substring @#% is repeating
        String input ="abc@#%def@#%ghi@#%jkl@#%mno@#%pqr@#%stu@#%wxy@#%z";
        String substring ="@#%";

        int count =0;
        int index=0;
        while ((index = input.indexOf(substring,index))!= -1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}
