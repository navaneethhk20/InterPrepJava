package Ex08082025.p1;

public class L6 {
    public static void main(String[] args) {
        String input ="nav@#$ane@#$eth@#$hos@#$uru@#$kop@#$palu@#$inw@#$hit@#$efi@#$eld@#$kad@#$ugo@#$dip@#";
        String substring="@#$";
        int count=0;
        int index=0;
        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}
