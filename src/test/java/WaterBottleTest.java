import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
       waterBottle = new WaterBottle(100) ;
    }
    @Test
   public void hasVolume(){
        assertEquals(100,waterBottle.getVoulme(),0.01);
    }
    @Test
    public void takesDrink(){
        assertEquals(90, waterBottle.drinkWater(), 0.01);
    }
    @Test
    public void emptyDrink(){
        assertEquals(0,  waterBottle.emptyWater(), 0.01);
    }
    @Test
    public void fillDrinkBack(){
        waterBottle.emptyWater();
        waterBottle.fillWater();
        assertEquals(100, waterBottle.fillWater(),0.01);
    }

}
