public class AccountServices extends BankAccount{


    public AccountServices(String accountHolderName, double balance,String type) {
        super(accountHolderName, balance,type);
    }

    @Override
    //for withdrawing money
    public void withdraw(double amount) {
        double balance=getBalance();
        if(amount > balance){
            System.out.println("Account Balance is lower than the requested withdrawl amount");
        }else{
            super.setBalance(amount);
            System.out.println("withdrawn $"+amount+".Current Balance is $"+getBalance());
        }
    }


}
