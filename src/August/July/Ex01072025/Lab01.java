package August.July.Ex01072025;

public class Lab01 {

        //Functions
        //no parameter and no return type
        public void test1(){
            System.out.println("Hello");
        }
        //with parameter and no return type
        public void test2(String name){
            System.out.println("Hello Nithu");
        }

        // Without parameter and with return type
        public String test3(){
            String name ="Nithu";
            return name;
        }

        //with parameter and with return type
    public String test4(String name){
        System.out.println("My name is "+name);
        return name;
    }
public static void main(String[] args) {
            Lab01 lab01 = new Lab01();
            lab01.test1();
            lab01.test2("Akash");
            lab01.test3();
            lab01.test4("Nithu");

}
}
