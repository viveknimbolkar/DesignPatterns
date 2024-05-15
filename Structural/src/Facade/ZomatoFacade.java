package Facade;

public class ZomatoFacade {
    Restaurant restaurant;
    DeliveryTeam deliveryTeam;

    public void placeOrder(){
        restaurant.prepareOrder();
        deliveryTeam.assignDeliveryBoy();
    }
}
