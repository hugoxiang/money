import com.essexlg.money.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    void test_multiplication() {
        final Dollar five = new Dollar(5);
        Dollar product = five.times(2);

        assertEquals(10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }

    @Test
    void test_equality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
    }
}
