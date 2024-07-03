package d6.ex0702_2_2;

public class Saving extends Bank{

    private int round;
    private int tagetRound;
    private int depositAmount;


    public Saving(
            String password,
            int targetRound,
            int depositAmount
    ){
        super(password);
        this.tagetRound = targetRound;
        this.depositAmount = depositAmount;
    }

    @Override
    public boolean deposit(int amount) {

        if (amount != depositAmount){
            return false;
        }

        this.round++;
        return super.deposit(amount);
    }

    public boolean withdraw(int amount, String password){
        if (round < tagetRound){
            return false;
        }
        return super.withdraw(amount, password);
    }
}
