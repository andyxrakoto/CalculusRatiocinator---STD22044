import affirmation.Implication;
import affirmation.Mensonge;
import affirmation.Verite;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AffirmationTest {
    @Test
    public void testVerite() {
        Verite verite1 = new Verite("Lou est beau");
        assertTrue(verite1.getValeur());
        assertEquals("Lou est beau: true", verite1.toString());
    }

    @Test
    public void testMensonge() {
        Mensonge mensonge1 = new Mensonge("Lou est pauvre");
        assertFalse(mensonge1.getValeur());
        assertEquals("Lou est pauvre: false", mensonge1.toString());
    }

    @Test
    public void testImplication() {
        Implication affirmation1 = new Implication("Lou est généreux");
        assertNull(affirmation1.getValeur());
        affirmation1.setValeur(true);
        assertEquals("Lou est généreux: true", affirmation1.toString());
    }
}
