package Facade;

public class DeliveryTeam {
    DeliveryBoy deliveryBoy;
    public void assignDeliveryBoy(){
        System.out.println("assigning order to delivery boy...");
        deliveryBoy.setDeliveryBoy("John","Main street 34, USA");
    }
}
