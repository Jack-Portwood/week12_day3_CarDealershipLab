package Cars;

import Components.Tyres;
import Components.Engine;

public abstract class Vehicle {

    private  String colour;
    private Engine engineClass;
    private double price;
    private Tyres tyres;

    public Vehicle(String colour, Engine engineClass, double price, Tyres tyres ){
        this.colour = colour;
        this.engineClass = engineClass;
        this.price = price;
        this.tyres = tyres;
    }

    public String getColour() {
        return colour;
    }

    public Engine getEngineClass() {
        return engineClass;
    }

    public double getPrice() {
        return price;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
