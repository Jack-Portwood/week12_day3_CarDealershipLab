package Cars;

import Components.Engine;
import Components.Exhaust;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCatTest {


    HybridCar hybridcar;
    Engine engine;
    Exhaust exhaust;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine();
        exhaust = new Exhaust();
        tyres = new Tyres();
        hybridcar = new HybridCar("Orange", engine, 800.00, tyres, exhaust);

    }

    @Test
    public void canGetColour(){
        assertEquals( "Orange", hybridcar.getColour());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(engine, hybridcar.getEngineClass());

    }

    @Test
    public void caGetPrice(){
        assertEquals(800.00, hybridcar.getPrice(), 0.1);
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres, hybridcar.getTyres());
    }

    @Test
    public void canGetExhaust(){
        assertEquals(exhaust, hybridcar.getExhaust());
    }


}
