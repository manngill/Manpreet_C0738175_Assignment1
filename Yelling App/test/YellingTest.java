
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class YellingTest {

    Yelling yelling;

    public YellingTest() {
        yelling = new Yelling();
    }

    @Test
    public void testScream() {
        String expResult = "Jenelle is yelling";
        String result = yelling.scream("Jenelle");
        assertEquals(expResult, result);
    }

    @Test
    public void testScreamTc2() {
        String expResult = "JENELLE IS YELLING";
        String result = yelling.scream("JENELLE");
        assertEquals(expResult, result);
    }

    @Test
    public void testScreamTc3() {
        String result = yelling.scream(null);
        String expResult = "Nobody is yelling";
        assertEquals(expResult, result);
    }

}
