package August.July.Ex02072025.Part1;

public class Lab02 {
    public static void main(String[] args) {
        String name ="NithuH K Kalaya ";
        System.out.println(name.length());
        System.out.println(name.indexOf('i'));
        System.out.println(name.concat(" H K"));
        System.out.println(name.contains("thu"));
        System.out.println(name.charAt(4));
        System.out.println(name.replace('u','a'));
        StringBuilder sb = new StringBuilder("Nithu");
        System.out.println(sb.append(" H K"));
        String name2 = name.trim();
        System.out.println(name2);
        String par = name.substring(1,4);
        System.out.println(par);

    }
}
