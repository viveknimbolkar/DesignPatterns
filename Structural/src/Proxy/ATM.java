package Proxy;

import Proxy.Account;
import Proxy.BankAccount;

public class ATM implements Account {
    BankAccount bankAccount = new BankAccount(12345,45000);

    @Override
    public void withdraw() {
        bankAccount.withdraw();
    }

    @Override
    public int getAccountNumber() {
   return bankAccount.getAccountNumber();
    }
}
