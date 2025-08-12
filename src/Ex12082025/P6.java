package Ex12082025;

public class P6 {
    public static void main(String[] args) {
        String input="abc@#$def@#$GHI@#$tre@#$OIU@#$MNB@#$";
        String substring ="@#$";
       int index=0;
       int count=0;
        while ((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}
