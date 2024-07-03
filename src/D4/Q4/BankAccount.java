package D4.Q4;

public class BankAccount {

    private String account;
    private String password;
    private int balance;

    public BankAccount(
            String account,
            String password,
            int balance

    ) {
        this.account = account;
        this.password = password;
        this.balance = balance;

    }


    public void deposit(
            int depositAmount
    ){
        balance += depositAmount;
        System.out.println(String.format("잔액: %d",balance));
    }

    public void withdraw(
            int wihtdrawAmount,
            String inputpass
    ){
           if (password.equals(inputpass)) {       //nếu mk nhập đúng
               System.out.println("로그인 성공");    // thì in ra "đăng nhập thành công

               if (wihtdrawAmount < balance) {     // nếu tiền rút ít hơn số dư
                   System.out.println("출금 성공");  // rút tiền thành công
                   balance -= wihtdrawAmount;       // số dư - tiền rút
                   System.out.println(String.format("잔액: %d", balance)); // hiện số dư
               }
               else {
                   System.out.println(String.format("잔액 부족. 잔액: %d", balance)); // nếu tiền rút lớn hơn số dư thì in ra nội dung
               }
           }
           else {
               System.out.println("비밀번호 불일치"); // sai mật khẩu
           }
    }
}













