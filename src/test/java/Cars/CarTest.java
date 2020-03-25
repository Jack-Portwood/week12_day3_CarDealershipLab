package Cars;

import Components.Engine;
import Components.Exhaust;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;
    Engine engine;
    Exhaust exhaust;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine();
        exhaust = new Exhaust();
        tyres = new Tyres();
        car = new Car("Orange", engine, 800.00, tyres, exhaust);

    }

    @Test
    public void canGetColour(){
        assertEquals( "Orange", car.getColour());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(engine, car.getEngineClass());

    }

    @Test
    public void caGetPrice(){
        assertEquals(800.00, car.getPrice(), 0.1);
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void canGetExhaust(){
        assertEquals(exhaust, car.getExhaust());
    }

}
