package Year2025.August.July.Ex04072025.Encapsulation;

public class ICICI_Bank {

    private String name;
    private long balance;

    public ICICI_Bank(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("Not allowed");
        }
    }
}
