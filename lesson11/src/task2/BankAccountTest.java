package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankAccountTest {

    @Test
    public void shouldNotBeBlockedWhenCreated() {
        BankAccount account = new BankAccount("a", "b");
        assertFalse(account.isBlocked());
    }

    @Test
    public void shouldReturnZeroAmountAfterActivation() {
        BankAccount account = new BankAccount("a", "b");
        account.activate("RUB");
        assertEquals(Integer.valueOf(0), account.getAmount());
        assertEquals("RUB", account.getCurrency());
    }

    @Test
    public void shouldBeBlockedAfterBlockIsCalled() {

        BankAccount account = new BankAccount("a", "b");


        account.block();


        assertTrue(account.isBlocked());
    }

    @Test
    public void shouldReturnFirstNameThenSecondName() {

        BankAccount account = new BankAccount("Ivan", "Ivanov");
        String[] expected = {"Ivan", "Ivanov"};


        String[] result = account.getFullName();


        assertArrayEquals(expected, result);
    }

    @Test
    public void shouldReturnNullAmountWhenNotActive() {

        BankAccount account = new BankAccount("a", "b");


        String currency = account.getCurrency();


        assertNull(currency);
    }
}