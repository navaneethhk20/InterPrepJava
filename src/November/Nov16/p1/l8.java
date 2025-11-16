package November.Nov16.p1;

public class l8 {
    static int count=0;
    public static void main(String[] args) {
        String input="abc";
        System.out.println("permutation is "+input+":");
        permutation(input,"");
        System.out.println("total count is "+count);

    }

    public static void permutation(String str, String result) {
        if (str.length() == 0) {
            count++;
            System.out.println(result);
            return;
        }

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            String remainning = str.substring(0, i) + str.substring(i + 1);
            permutation(remainning, result + ch);
        }

    }
}
