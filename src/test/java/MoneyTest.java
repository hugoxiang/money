import com.essexlg.money.Dollar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void test_multiplication() {
        final Dollar five = new Dollar(5);
        five.times(2);

        assertEquals(10, five.amount);
    }
}
