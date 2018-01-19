

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import main.*;


public class TestMain {
	
    @Before
	public void setUp() {
    	
    }

    @Test
    public void testReturnFive() {
        assertEquals(new Integer(5), Main.returnFive());
    }
    
}
