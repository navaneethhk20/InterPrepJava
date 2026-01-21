package Year2025.November.Nov09.p1;

public class l8 {
    public static void main(String[] args) {
        String input="Nacre SoftWare Solutions";
        int smallletters=0;
        int capitalletters=0;

        for(char ch:input.toCharArray()){
            if(Character.isUpperCase(ch)){
                capitalletters++;
            }else if(Character.isLowerCase(ch)){
                smallletters++;
            }
        }
        System.out.println(smallletters);
        System.out.println(capitalletters);
    }
}
