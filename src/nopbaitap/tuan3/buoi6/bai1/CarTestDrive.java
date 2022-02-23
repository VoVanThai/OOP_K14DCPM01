package nopbaitap.tuan3.buoi6.bai1;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car();
        car.setCarColor("Red");
        car.setCarPrice(99999);
        System.out.println("Color: " +car.getCarColor());
        System.out.println("Price: " +car.getCarPrice());
    }
    
}
