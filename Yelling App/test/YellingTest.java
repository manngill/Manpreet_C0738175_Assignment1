
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class YellingTest {
    
    public YellingTest() {
    }
    
    @Test
    public void testScream() {
        Yelling yelling = new Yelling();
        String expResult = "Jenelle is yelling";
        String result = yelling.scream("Jenelle");
        assertEquals(expResult, result);        
    }
    
}
