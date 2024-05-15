package Facade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Facade");
        ZomatoFacade zf = new ZomatoFacade();
        zf.placeOrder();
    }
}
