package Ex2508202526082025.P1;

public class L5 {
    public static void main(String[] args) {

        String input = "fsd^%$klppk^%$piok^$";
        String substring = "^%$";
        int count=0;
        int index=0;
        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}