import java.util.*;

public abstract class BankAccount{

    private String accountHolderName;
    private double balance;
    private String accountType;
    private double fdamount;

    public BankAccount(String accountHolderName,double balance,String type) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType=type;
    }

    public double getBalance() {
        return balance;
    }

    public String getName(){
        return accountHolderName;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount+" Your current balance is $"+balance);
    }

    public void setBalance(double amount){
        balance=getBalance()-amount;
    }

    //FD calculation of Interest
    public void deposit(double amount,boolean fd){
        int interest=9;
            System.out.println("enter time period in years");
            Scanner BankAccount = new Scanner(System.in);
            double time=BankAccount.nextInt();

            double fdAmount=(amount*time*interest)/100;
            System.out.println("interest earned after"+time+"is "+fdAmount);
            balance=balance-amount;
        if(!fd){
            balance=balance+amount;
            System.out.println("Deposited: $" + amount+" Your current balance is $"+balance);
        }
        fdamount=fdamount+amount;
        System.out.println("Deposited: $" + amount+" to your fd acoount current balance is "+fdamount);
    }

    //Bank Account Information
    public void getAccountInformation(){
        System.out.println("************************Your Account Information*******************");
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Type: "+ accountType);
        System.out.println("Account balance: $"+balance);
        if (fdamount!=0){
            System.out.println("Your FD Amount: $"+fdamount);
        }
    }

    //for Fixed Deposit
    public double getFD(){
        return fdamount;
    }
    
    public abstract void withdraw(double amount);
}