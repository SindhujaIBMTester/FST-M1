package activities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {

    @Test()
    public void notEnoughFunds(){
        BankAccount acc = new BankAccount(10);
        assertThrows(NotEnoughFundsException.class, () -> acc.withdraw(11));
    }

    @Test()
    public void enoughFunds(){
        BankAccount acc = new BankAccount(100);
        // Assertion for no exceptions
        assertDoesNotThrow(() -> acc.withdraw(100));
    }

}
