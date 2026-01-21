package Year2025.November.Nov09.p2;

public class p1 {
    public static void main(String[] args) {
        String input="NavaneetH@#!1232^$";

        StringBuilder uppercase= new StringBuilder();
        StringBuilder smallercase= new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder specialchar = new StringBuilder();

        for(char ch:input.toCharArray()){
            if(Character.isUpperCase(ch)){
                uppercase.append(ch);
            }else if(Character.isLowerCase(ch)){
                smallercase.append(ch);
            }else if(Character.isDigit(ch)){
                number.append(ch);
            }else {
                specialchar.append(ch);
            }
        }

        System.out.println(uppercase);
        System.out.println(smallercase);
        System.out.println(number);
        System.out.println(specialchar);

        int stringlength=input.length();
        System.out.println(stringlength);

        System.out.println("percentage of uppercase is  "+(uppercase.length()*100.0)/stringlength);
        System.out.println("percentage of uppercase is  "+(smallercase.length()*100.0)/stringlength);
        System.out.println("percentage of uppercase is  "+(number.length()*100.0)/stringlength);
        System.out.println("percentage of uppercase is  "+(specialchar.length()*100.0)/stringlength);

    }
}
