package in.CreateBank;

 class BankAccount {
     private String AccountNo;
     private String CustomerName;
     private  double Balance;

     public BankAccount(String AccountNo, String CustomerName) {
         this.AccountNo = AccountNo;
         this.CustomerName = CustomerName;
     }

//     public void Display(String AccountNo, String CustomerName){
//         System.out.println("Your Account number is : "+AccountNo);
//         System.out.println("Your Name is : "+CustomerName);
//     }

     public void DepositMoney(double money){
         if (money <=0)
             System.out.println("Invalid Deposit");
         else
             Balance = Balance+money;
         System.out.println("Your Deposit money is : "+money+" Current Balance is : "+Balance);
     }

     public void WithdrawMoney(double money){
         if (money<=0) {
             System.out.println("Invalid Withdraw");
         }
        else if (Balance>money) {
             Balance = Balance - money;
             System.out.println("Your withdraw money is : "+money+" Current Balance is : "+Balance);
         } else if (Balance<money) {
             System.out.println("There have no money in the account");
         } else {
             money = Balance;
             Balance =0;
             System.out.println("Your balance is zero");
         }
     }
}
