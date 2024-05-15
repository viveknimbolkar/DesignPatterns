package Proxy;

public class Main {
    public static void main(String[] args) {
        // ATM works as a proxy for bank
        ATM atm = new ATM();
        atm.withdraw();
        System.out.println(atm.getAccountNumber());
    }
}
