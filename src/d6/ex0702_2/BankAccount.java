package d6.ex0702_2;

public abstract class BankAccount {
    private int balance;
    private String password;
    private int deposit;
    private int withdraw;
    private String pass = "Diu123";

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void withdraw(){

        if (this.password.equals(pass)){
            if(withdraw <= balance){
                balance -= withdraw;
                System.out.println(String.format("출금 성공"));
                System.out.println(String.format("출금액: %d", withdraw));
                System.out.println(String.format("잔액: %d", balance));
            }
            else {
                System.out.println("잔액 부족");
            }

        }
        else {
            System.out.println("비밀번호 불일치");
        }
    }



}
