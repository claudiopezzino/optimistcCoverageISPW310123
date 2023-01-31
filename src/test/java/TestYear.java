import org.example.Year;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestYear {

    /* Optimistic Coverage because tester check correctly the current year,
     but next year this test will fail because of Class Year implementation*/
    @Test
    public void testCurrent(){
        Year year = new Year();

        int expected = 2023;
        int actual = year.current();

        assertEquals(expected,actual);
    }
}
