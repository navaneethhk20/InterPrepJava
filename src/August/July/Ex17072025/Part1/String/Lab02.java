package August.July.Ex17072025.Part1.String;

public class Lab02 {
    public static void main(String[] args){
        //Write a program to reverse a string without string builder
        String s ="Nithu";
        String rev_name = "";
        for(int i=s.length()-1;i>=0;i--){
            rev_name = rev_name + s.charAt(i);
        }
        System.out.println(rev_name);
    }
}
