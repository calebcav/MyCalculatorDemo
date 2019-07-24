package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {

    @Test
    public void switchDisplayModeTest(){
        Display display = new Display();
        display.switchDisplayModes();
        String actual = display.displayMode;
        String expected = "octal";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void switchDisplayModeTest2(){
        Display display = new Display();
        display.switchDisplayModes("hexadecimal");
        String actual = display.displayMode;
        String expected = "hexadecimal";

        Assert.assertEquals(expected, actual);
    }

}
