package Year2025.October.oct29.p1;

public class l6 {
    public static void main(String[] args) {
        String input = "abc#$%vdfg#$%ffm#$%girge#$%groijgtr#$%oigret#$%";
        String substring = "#$%";
        int count=0;
        int index=0;
        while((index=input.indexOf(substring,index))!=-1){
          count++;
          index=index+substring.length();
        }
        System.out.println(count);
    }
}
