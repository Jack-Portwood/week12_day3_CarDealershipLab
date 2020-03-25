package People;

import Cars.Car;
import Cars.Electric;
import Cars.HybridCar;
import Components.Engine;
import Components.Exhaust;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Electric electric;
    HybridCar hybridcar;
    Engine engine;
    Exhaust exhaust;
    Tyres tyres;

    @Before
    public void before() {

        engine = new Engine();
        exhaust = new Exhaust();
        tyres = new Tyres();
        car = new Car("Orange", engine, 800.00, tyres, exhaust);
        electric = new Electric("Orange", engine, 800.00, tyres);
        hybridcar = new HybridCar("Orange", engine,800.00, tyres, exhaust);
        customer = new Customer(1000.00);

    }
    @Test
    public void canGetMoney(){
        assertEquals(1000.00, customer.getMoney(), 0.1);
    }

    @Test
    public void CanOwnCars(){
        assertEquals(0, customer.getOwnedVehicles());
    }

    @Test
    public void canBuyCars(){
        customer.buyVehicle(car);
        assertEquals(1, customer.getOwnedVehicles());
    }
}
