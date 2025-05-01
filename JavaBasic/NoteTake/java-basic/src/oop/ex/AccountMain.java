package oop.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.setBalacne();
        myAccount.deposit(10000);
        myAccount.withdraw(9000);
        myAccount.withdraw(1000000);
    }
}
