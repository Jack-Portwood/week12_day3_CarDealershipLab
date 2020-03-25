package Cars;

import Components.Engine;
import Components.Exhaust;
import Components.Tyres;

public class HybridCar extends Vehicle {

    private Exhaust exhaust;


    public HybridCar(String colour, Engine engineClass, double price, Tyres tyres, Exhaust exhaust) {
        super(colour, engineClass, price, tyres);
        this.exhaust = exhaust;

    }


    public Exhaust getExhaust() {
        return exhaust;
    }
}


