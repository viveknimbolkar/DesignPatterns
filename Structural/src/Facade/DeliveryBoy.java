package Facade;

public class DeliveryBoy {
    String name;
    String address;

    DeliveryBoy(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getDeliveryBoy(){
        return name;
    }

    public void setDeliveryBoy(String name, String address){
        this.name = name;
        this.address = address;
    }
}
