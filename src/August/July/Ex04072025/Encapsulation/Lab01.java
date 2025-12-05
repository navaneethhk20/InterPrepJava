package August.July.Ex04072025.Encapsulation;

public class Lab01 {
    public static void main(String[] args) {
       ICICI_Bank iciciBank = new ICICI_Bank("Nithu", 3215L);
        System.out.println(iciciBank.getBalance());
        System.out.println(iciciBank.getName());
        iciciBank.setName("Navaneeth");
        System.out.println(iciciBank.getName());
        iciciBank.setBalance(10054l);
        System.out.println(iciciBank.getBalance());

    }
}
