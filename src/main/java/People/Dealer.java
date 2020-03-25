package People;

import Cars.Car;
import Cars.Vehicle;

import java.util.ArrayList;

public class Dealer {

    private double till;
    private ArrayList<Vehicle> stock;

    public Dealer(double till){
    this.till = till;
    this.stock = new ArrayList<Vehicle>();

    }

    public double getTill() {
        return till;
    }

   public int getStock() {
        return stock.size();
   }

    public void buyVehicle(Vehicle vehicle){
        if(this.till >= vehicle.getPrice()) {
            this.stock.add(vehicle);
            this.till -= vehicle.getPrice();
        }
    }
}
