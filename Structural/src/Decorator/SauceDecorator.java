package Decorator;

public class SauceDecorator extends PizzaDecorator{
    public  SauceDecorator(Pizza pizza){
        super(pizza);
    }

    @Override
    public String bake() {
       return  pizza.bake() + addSauce();
    }

    String addSauce(){
        return "Add sauce";
    }

}
