package Ex19072025.Part1;

public class Lab02 {
    public static void main(String[] args){
        //reverse string without string builder
        String input = "Nithu";
        String rev ="";
        for(int i=input.length()-1;i>=0;i--){
            rev = rev + input.charAt(i);
        }
        System.out.println(rev);
    }
}
