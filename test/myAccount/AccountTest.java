package myAccount;

import org.junit.Test;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatIHvaeAnAccount_MyBalnceIsZero_IDepossit500_MyBalanceIs500() {
        Account myAccount = new Account();
        assertEquals(0 , myAccount.checkBalance());

        myAccount.deposit(500);
        assertEquals(500 , myAccount.checkBalance());

    }

    @Test
    public void testThatIHvaeAnAccount_MyBalnceIsZero_IDepossitMinus500_MyBalanceIsZero() {
        Account myAccount = new Account();
        assertEquals(0 , myAccount.checkBalance());

        myAccount.deposit(-500);
        assertEquals(0 , myAccount.checkBalance());

    }


    @Test
    public void testThatIHvaeAnAccount_MyBalnceIsZero_IDepossit2000_MyBalanceIs2000_IWithdraw700_MyBalanceIs1300() {
        Account myAccount = new Account();
        assertEquals(0 , myAccount.checkBalance());

        myAccount.deposit(2000);
        assertEquals(2000 , myAccount.checkBalance());

        myAccount.withdraw(700);
        assertEquals(1300 , myAccount.checkBalance());

    }

    @Test
    public void testThatIHvaeAnAccount_MyBalnceIsZero_IDepossit2000_MyBalanceIs2000_IWithdrawMinus700_MyBalanceIs2000() {
        Account myAccount = new Account();
        assertEquals(0 , myAccount.checkBalance());

        myAccount.deposit(2000);
        assertEquals(2000 , myAccount.checkBalance());

        myAccount.withdraw(-700);
        assertEquals(2000 , myAccount.checkBalance());

    }

    @Test
    public void testThatIHvaeAnAccount_MyBalnceIsZero_IDepossit2000_MyBalanceIs2000_IWithdraw7000_MyBalanceIs2000() {
        Account myAccount = new Account();
        assertEquals(0 , myAccount.checkBalance());

        myAccount.deposit(2000);
        assertEquals(2000 , myAccount.checkBalance());

        myAccount.withdraw(7000);
        assertEquals(2000 , myAccount.checkBalance());

    }

}
