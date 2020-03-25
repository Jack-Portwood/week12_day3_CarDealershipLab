package Cars;

import Components.Engine;
import Components.Exhaust;
import Components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {


    Electric electric;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine();
        tyres = new Tyres();
        electric = new Electric("Orange", engine, 800.00, tyres);

    }

    @Test
    public void canGetColour(){
        assertEquals( "Orange", electric.getColour());
    }

    @Test
    public void canGetEngineType(){
        assertEquals(engine, electric.getEngineClass());

    }

    @Test
    public void caGetPrice(){
        assertEquals(800.00, electric.getPrice(), 0.1);
    }

    @Test
    public void canGetTyres(){
        assertEquals(tyres, electric.getTyres());
    }





}
