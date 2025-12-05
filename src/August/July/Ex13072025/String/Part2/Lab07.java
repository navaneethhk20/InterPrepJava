package August.July.Ex13072025.String.Part2;

public class Lab07 {
    public static void main(String[] args) {
        String input= "5opre%^8u&*6(@#7j5";
        StringBuilder alphabets =new StringBuilder();
        StringBuilder specialCharacter = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for(char ch: input.toCharArray()){
            if(Character.isAlphabetic(ch)){
                alphabets.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }else {
                specialCharacter.append(ch);
            }
        }

        System.out.println("alpabets: "+ alphabets);
        System.out.println("numbers: "+ numbers);
        System.out.println("specislcharacter: "+specialCharacter);
    }
}
