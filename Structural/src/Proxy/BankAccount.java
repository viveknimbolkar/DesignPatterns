package Proxy;

import Proxy.Account;

public class BankAccount implements Account {
   public int accountNumber;
   public int amount;

   BankAccount(int accountNumber,int amount){
       this.accountNumber = accountNumber;
       this.amount=amount;
   }
    @Override
    public void withdraw() {

    }
    @Override
    public int getAccountNumber(){
return accountNumber;
    }
}
