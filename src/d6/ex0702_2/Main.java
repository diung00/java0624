package d6.ex0702_2;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new SavingAccount();
        bankAccount.setBalance(30000);
        bankAccount.setPassword("Diu124");
        bankAccount.setWithdraw(3000);

        bankAccount.withdraw();



    }
}
