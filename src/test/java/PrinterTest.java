import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
Printer printer;
 @Before
    public void before(){
      printer = new Printer(30, 40,100);
 }
 @Test
    public void hasPagesLeft(){
     assertEquals(30, printer.getNumOfSheetsPaperLeft());

    }
    @Test
    public void hasCopied(){
     assertEquals(40,printer.getNumOfCopies());
    }
    @Test
    public void hasPages(){
        assertEquals(100,printer.getNumOfPages());
    }
    @Test
    public void NumOfPages(){
        assertEquals(60, printer.NumOfPagesAndCopied());
    }




}
