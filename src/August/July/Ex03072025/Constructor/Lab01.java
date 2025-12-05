package August.July.Ex03072025.Constructor;


public class Lab01 {
    //default constructor
    String name;
    String year;

    Lab01(){
        name ="Nithu";
        year= "2000";
        System.out.println("this is a default constructor");
    }

    public static void main(String[] args){
       Lab01 lab01 = new Lab01();
        System.out.println(lab01.name);
        System.out.println(lab01.year);

    }
}
