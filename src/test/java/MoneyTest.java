import com.essexlg.money.Bank;
import com.essexlg.money.Expression;
import com.essexlg.money.Money;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class MoneyTest {
    @Test
    void test_multiplication() {
        final Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    void test_equality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
    }

    @Test
    void test_dollar_franc_equality() {
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    void test_franc_multiplication() {
        final Money five = Money.franc(5);

        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }

    @Test
    void test_currency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void test_simple_addition() {
        final Money five = Money.dollar(5);
        Expression sum = five.plus(five);
        final Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }
}
