package Year2025.November.Nov07.p1;

public class l1 {
    public static void main(String[] args){
        String input="nithu hsourukoppalu magge";

        String[] words=input.split("\\s+");
        String longest=words[0];
        String shortest=words[0];

        int maxlength=words[0].length();
        int minlength=words[0].length();

        for(String world:words){
            if(world.length()>maxlength){
                maxlength=world.length();
                longest=world;
            }
        }

        for(String world: words){
            if(world.length()<minlength){
             minlength=world.length();
             shortest=world;
            }
        }
        System.out.println(longest);
        System.out.println(shortest);



    }
}
