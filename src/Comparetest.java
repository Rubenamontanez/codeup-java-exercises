import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Comparetest {
    @Test
    public void testCompareNumbers(){
//        greater than
        assertEquals(Programmingpushups.compareNumbers(50.0,37.625), "50.0 > 37.625");
//        Less than
        assertEquals(Programmingpushups.compareNumbers(30.0,37.625), "30.0 < 37.625");
//          Equals
        assertEquals(Programmingpushups.compareNumbers(30.0,30), "30.0 == 30.0");
    }
}
