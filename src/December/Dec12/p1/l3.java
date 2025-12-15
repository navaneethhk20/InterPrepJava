package December.Dec12.p1;
import org.openqa.testng.annotations.Test;
public class l3 {

    public static int add ( int a , int b){
        return a +b;
    }
    @Test(group "sanity")
    public static void main(String[] args) {
        int a=10; int b=5;
        System.out.println(add(a,b));
       Assert.equals(a+b,15);
    }

}
