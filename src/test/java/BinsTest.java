import org.junit.Test;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

public class BinsTest {
    @Test
    public void testBinConstructor(){
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        Assert.assertNotNull(bins);
    }

    public Integer getBin(int binNumber){
        return 0;
    }

    @Test
    public void testGetBin(){
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        int actual = bins.getBin( 4);
        Assert.assertEquals( 0, actual);
    }
    @Test
    public void testIncrementBin(){
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        bins.incrementBin(4);
        Assert.assertEquals( 1, bins.getBin(4).intValue());
    }
}