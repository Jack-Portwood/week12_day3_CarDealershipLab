package Cars;

import Components.*;

public class Car extends Vehicle {

    private Exhaust exhaust;

    public Car(String colour, Engine engineClass, double price, Tyres tyres, Exhaust exhaust) {
        super(colour, engineClass, price, tyres);
        this.exhaust = exhaust;
    }

    public Exhaust getExhaust() {
        return exhaust;
    }
}
