import operationdesLogiques.Donc;
import operationdesLogiques.Et;
import operationdesLogiques.Ou;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperationTest {
    @Test
    public void testEt() {
        Et etOperation1 = new Et(true, true);
        assertEquals("vrai", etOperation1.evaluer());

        Et etOperation2 = new Et(true, false);
        assertEquals("faux", etOperation2.evaluer());

        Et etOperation3 = new Et(false, false);
        assertEquals("faux", etOperation3.evaluer());

        Et etOperation4 = new Et(null, true);
        assertEquals("faux", etOperation4.evaluer());
    }

    @Test
    public void testOu() {
        Ou ouOperation1 = new Ou(true, true);
        assertEquals("vrai", ouOperation1.evaluer());

        Ou ouOperation2 = new Ou(true, false);
        assertEquals("vrai", ouOperation2.evaluer());

        Ou ouOperation3 = new Ou(false, false);
        assertEquals("faux", ouOperation3.evaluer());

        Ou ouOperation4 = new Ou(null, false);
        assertEquals("faux", ouOperation4.evaluer());

        Ou ouOperation5 = new Ou(null, true);
        assertEquals("vrai", ouOperation5.evaluer());
    }

    @Test
    public void testDonc() {
        Donc doncOperation1 = new Donc(true, true);
        assertEquals("vrai", doncOperation1.evaluer());

        Donc doncOperation2 = new Donc(true, false);
        assertEquals("faux", doncOperation2.evaluer());

        Donc doncOperation3 = new Donc(false, true);
        assertEquals("vrai", doncOperation3.evaluer());

        Donc doncOperation4 = new Donc(false, false);
        assertEquals("vrai", doncOperation4.evaluer());

        Donc doncOperation5 = new Donc(true, null);
        assertEquals("vrai", doncOperation5.evaluer());
    }
}
