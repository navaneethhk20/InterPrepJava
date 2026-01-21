package Year2025.December.Dec15.p1;

public class l5 {
    public static void main(String[] args) {
        String input= "fgrelkujmynhb#$%^gvfdcxsz3456#$%^sqxwdcevfrbg$%^&tn$#%^&hyjumjnhbgvfc$%^&dx76534^%$564323s";
        String substring="#$";
        int index=0;
                int count=0;
        while((index=input.indexOf(substring,index))!=-1){
            count++;
            index=index+substring.length();
        }
        System.out.println(count);
    }
}
