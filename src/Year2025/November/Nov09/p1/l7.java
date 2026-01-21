package Year2025.November.Nov09.p1;

public class l7 {
    public static void main(String[] args) {
        String input="fgewfsd";
        for(char ch:input.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                System.out.println("contains character");
                break;
            }else {
                System.out.println("does not contains");
                break;
            }
        }

    }
}
