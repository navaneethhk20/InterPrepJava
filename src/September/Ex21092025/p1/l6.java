package September.Ex21092025.p1;

public class l6 {
    public static void main(String[] args) {
       String input= "Fsdafsad%gdsF%#$GW$%#^hDFFDH#$%^GDFGWA$%^HJU%*&&%^TGSDF%#$WE$%@#$GDFSGWert5653ygfgt46353%#@$2536%^fsdafwer";
       String substring="#$";
       int count=0;
       int index=0;

       while((index=input.indexOf(substring,index))!=-1){
           count++;
           index=index+substring.length();
       }
       System.out.println(count);

    }
}
