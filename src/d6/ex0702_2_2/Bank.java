package d6.ex0702_2_2;

public class Bank {

    private int amount;
    private String password;

    public Bank(String password){
        this.amount = 0;
        this.password = password;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean deposit(int mount){
        this.amount += amount;
        return true;
    }

    public boolean withdraw(int amount, String password){

        if (!this.password.equals(password) ||  this.amount < amount){
              return false;
        }
        this.amount -= amount;
        return true;
    }

}

