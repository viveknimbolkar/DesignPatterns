package Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new CheeseBurstDecorator(new SauceDecorator(new BasePizza()));
        System.out.println(pizza.bake());
    }
}
