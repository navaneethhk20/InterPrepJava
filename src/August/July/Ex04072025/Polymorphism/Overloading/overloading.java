package August.July.Ex04072025.Polymorphism.Overloading;

public class overloading {
    //
 int gift(int a){
        System.out.println("A is a integer");
        return a;
    }
     String gift(String a){
        System.out.println("A is a string");
        return  a;
    }
    double gift(double a){
        System.out.println("A is a double");
        return a;
    }
    public static void main(String[] args) {
     overloading lab01 = new overloading();
     lab01.gift(1);
     lab01.gift(1.23);
     lab01.gift("nithu");

    }
}
