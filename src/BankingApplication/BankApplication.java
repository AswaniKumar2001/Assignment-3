package BankingApplication;

import java.util.*;

public class BankApplication  {

    //declaration
    private static int userInput;
    private static double initialAmount;

    private static String choice;

    //boolean expression for accessing while loop 
    private static boolean condition=true;
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a type of account you want to create:");
        System.out.println("1.Savings");
        System.out.println("2.Current");
        System.out.println("3.Dmat");

        int account = scanner.nextInt();
        if(account==1){
            choice="savings";
        }
        else if(account==2){
            choice="current";
        }
        else if(account==3){
            choice="dmat";
        }
        else{
            while(condition){
                System.out.println("Please choose from below menu");
                System.out.println("Enter a type of acount you want to create:");
                System.out.println("1.Savings");
                System.out.println("2.Current");
                System.out.println("3.Dmat");

                int accountType = scanner.nextInt();
                if(accountType==1){
                    choice="savings";
                    condition=false;
                }
                else if(accountType==2){
                    choice="current";
                    condition=false;
                }
                else if(accountType==3){
                    choice="dmat";
                    condition=false;
                }
            }
        }

            System.out.println("Account is Selected successfully!");
            System.out.println("Please Enter Your Name:");
            String accountHolderName=scanner.next();
            System.out.println("Please Enter the amount you would like to add into your account.Minimum Amount is $500");
            initialAmount=scanner.nextDouble();
            while (initialAmount<500){
                System.out.println("Minimum amount should be $500");
                initialAmount=scanner.nextDouble();
            }
            AccountServices accountServices=new AccountServices(accountHolderName,initialAmount,choice.toLowerCase());
            System.out.println(accountServices.getBalance());
            System.out.println("Account created successfully with the name "+accountServices.getName()+".You can use our services.");
            System.out.println("Please Enter the number of the service that you want to choose from below menu");
            System.out.println("1.Withdraw amount");
            System.out.println("2.Deposit amount");
            System.out.println("3.Check Balance");
            System.out.println("4.Check Account Information");
            System.out.println("5.Deposit money in FD");
            System.out.println("6.Exit");
            int value=scanner.nextInt();
            userInput=value;
                while(userInput !=6) {
                    if (userInput == 1) {
                        System.out.println("Please Enter the amount that you want to withdraw from your account:");
                        accountServices.withdraw(scanner.nextDouble());
                        System.out.println("Please Enter the number of the service that you want to choose from below menu");
                        System.out.println("1.Withdraw amount");
                        System.out.println("2.Deposit amount");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Check Account Information");
                        System.out.println("5.Deposit money in FD");
                        System.out.println("6.Exit");
                        int val = scanner.nextInt();
                        userInput=val;
                    }
                    else if(userInput == 2){
                        System.out.println("Please Enter an amount that you would like to credit:");
                        accountServices.deposit(scanner.nextDouble());
                        System.out.println("Please Enter the number of the service that you want to choose from below menu");
                        System.out.println("1.Withdraw amount");
                        System.out.println("2.Deposit amount");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Check Account Information");
                        System.out.println("5.Deposit money in FD");
                        System.out.println("6.Exit");
                        int val= scanner.nextInt();
                        userInput=val;
                    }
                    else if(userInput == 3){
                        System.out.println("Your account balance is $"+accountServices.getBalance());
                        System.out.println("Please Enter the number of the service that you want to choose from below menu");
                        System.out.println("1.Withdraw amount");
                        System.out.println("2.Deposit amount");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Check Account Information");
                        System.out.println("5.Deposit money in FD");
                        System.out.println("6.Exit");
                        int val= scanner.nextInt();
                        userInput=val;
                    }
                    else if(userInput == 4){
                        accountServices.getAccountInformation();
                        System.out.println("Please Enter the number of the service that you want to choose from below menu");
                        System.out.println("1.Withdraw amount");
                        System.out.println("2.Deposit amount");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Check Account Information");
                        System.out.println("5.Deposit money in FD");
                        System.out.println("6.Exit");
                        int val= scanner.nextInt();
                        userInput=val;

                    }
                    else if(userInput == 5){
                        System.out.println("Enter the amount you want to deposit into your FD: ");
                        double fdmoney=scanner.nextDouble();
                        accountServices.deposit(fdmoney,true);
                        System.out.println("Please Enter the number of the service that you want to choose from below menu");
                        System.out.println("1.Withdraw amount");
                        System.out.println("2.Deposit amount");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Check Account Information");
                        System.out.println("5.Deposit money in FD");
                        System.out.println("6.Exit");
                        int val= scanner.nextInt();
                        userInput=val;

                    }
                    else{
                        System.out.println("There is no service related to chosen number");
                        System.out.println("Please Enter the number of the service that you want to choose from below menu");
                        System.out.println("1.Withdraw amount");
                        System.out.println("2.Deposit amount");
                        System.out.println("3.Check Balance");
                        System.out.println("4.Check Account Information");
                        System.out.println("5.Deposit money in FD");
                        System.out.println("6.Exit");
                        int val= scanner.nextInt();
                        userInput=val;
                    }

                }
            System.out.println("Your have chosen to exit!");



    }
}