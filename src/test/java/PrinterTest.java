import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer( 10, 8);
    }

    @Test
    public void hasPaper(){
        assertEquals(10, printer.checkPaper());
    }

    @Test
    public void sheetsNeeded(){
        assertEquals(4, printer.sheetsNeeded(2,2 ));
    }

    @Test
    public void printSuccess(){
        printer.print(2,2);
        assertEquals(6, printer.checkPaper());
    }

    @Test
    public void printFailure(){
        printer.print(5,5);
        assertEquals(10, printer.checkPaper());
    }

    @Test
    public void refillPrinter(){
        printer.refill(90);
        assertEquals(100, printer.checkPaper());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(8, printer.checkTonerVolume());
    }

    @Test
    public void successfulPrintTonerReduced(){
        printer.print(2,3);
        assertEquals(2, printer.checkTonerVolume());
    }

    @Test
    public void failurePrintTonerNotReduced(){
        printer.print(3,3);
        assertEquals(8, printer.checkTonerVolume());
    }



}
