package Year2025.November.Nov09.p1;

public class l6 {
    public static void main(String[] args) {
        String input="nacre software";
//        String result =input.replace("a","");
//        System.out.println(result);
        StringBuilder sb= new StringBuilder();
        for(char ch:input.toCharArray()){
            if(ch!='a'){
                sb.append(ch);
            }

        }
        System.out.println(sb.toString());

    }
}
