package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class ScientificFeaturesTest {

    @Test
    public void sinTest(){
        ScientificFeatures calculator = new ScientificFeatures(5);
        double actual = calculator.sin();
        double expected = -0.9589242746631385;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void cosineTest(){
        ScientificFeatures calculator = new ScientificFeatures(4);
        double actual = calculator.cosine();
        double expected = -0.6536436208636119;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void tangentTest(){
        ScientificFeatures calculator = new ScientificFeatures(7);
        double actual = calculator.tangent();
        double expected = 0.8714479827243188;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseSinTest(){
        ScientificFeatures calculator = new ScientificFeatures(1);
        double actual = calculator.inverseSin();
        double expected = 1.5707963267948966;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseCosineTest(){
        ScientificFeatures calculator = new ScientificFeatures(1);
        double actual = calculator.inverseCosine();
        double expected = 0;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void inverseTangentTest(){
        ScientificFeatures calculator = new ScientificFeatures(1);
        double actual = calculator.inverseTangent();
        double expected = 0.7853981633974483;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void factorialTest(){
        ScientificFeatures calculator = new ScientificFeatures(4);
        double actual = calculator.factorial();
        double expected = 24;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void naturalLogTest(){
        ScientificFeatures calculator = new ScientificFeatures(4);
        double actual = calculator.naturalLog();
        double expected = 1.3862943611198906;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void base10LogTest(){
        ScientificFeatures calculator = new ScientificFeatures(3);
        double actual = calculator.base10Log();
        double expected = 0.47712125471966244;

        Assert.assertEquals(expected, actual, 0);
    }

}
