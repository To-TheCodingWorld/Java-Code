package in.CreateBank;

public class BankTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("585546","Shubo");
        System.out.println(account);
//        account.Display("332233","Mahabir");
        account.DepositMoney(5000);
        account.WithdrawMoney(2000);

        account.DepositMoney(5000);
        account.WithdrawMoney(3000);
//        System.out.println(account.WithdrawMoney(0));
        account.DepositMoney(45000);
       account.WithdrawMoney(2564);
       account.WithdrawMoney(47436);

    }
}
