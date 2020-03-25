package People;

import Cars.Car;
import Cars.Electric;
import Cars.HybridCar;
import Components.Exhaust;
import Components.Tyres;
import Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Customer customer;
    Car car;
    Electric electric;
    HybridCar hybridCar;
    Engine engine;
    Exhaust exhaust;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine();
        exhaust = new Exhaust();
        tyres = new Tyres();
        car = new Car("Orange", engine, 800.00, tyres, exhaust);
        hybridCar = new HybridCar("Orange", engine, 800.00, tyres, exhaust);
        electric = new Electric("Orange", engine, 800.00, tyres);
        customer = new Customer(1000.00);
        dealer = new Dealer(60000);

    }

    @Test
    public void canGetTill(){
        assertEquals (60000, dealer.getTill(), 0.1);
    }

    @Test
    public void canGetStock(){
        assertEquals(0, dealer.getStock());
    }

    @Test
    public void canBuyVechicle(){
        dealer.buyVehicle(car);
        assertEquals(1, dealer.getStock());

        }
    }

