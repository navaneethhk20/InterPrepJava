package December.Dec30.p1;

public class l6 {
    public static void main(String[] args) {
        String input="hfd3#$gf#$%dhyt^&%FSDGretgryh$%#$%Br#$%tyyj#$%^u^$%^fswe#$%rwe345^#$";
        String substring="#$%";
        int count=0;
        int index=0;

        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }

        System.out.println(count);
    }
}
