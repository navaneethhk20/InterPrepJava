package Ex30072025;

public class Lab17 {
    public static void main(String[] args) {
        String inp="polop";
        for(int i=0;i<inp.length();i++){
            for (int j=i+1;j<inp.length();j++){
                if(inp.charAt(i)==inp.charAt(j)){
                    System.out.println("character "+inp.charAt(i)+" is found at "+i+" and "+j);
                }
            }
        }
    }
}
