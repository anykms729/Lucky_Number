package Project1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
//    private int customerNumber, pinNumber;
//    double checkingBalance, savingBalance;

    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }
    public double setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    public int getPinNumber(){
        return pinNumber;
    }
    public double getCheckingBalance(){
        return checkingBalance;
    }
    public double getSavingBalance(){
        return savingBalance;
    }

    //Calculate Checking Account Withdrawal

    public double calCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance-amount);
        return checkingBalance;
    }
    public double calSavingWithdraw(double amount){
        savingBalance = (savingBalance-amount);
        return savingBalance;
    }
    public double calCheckingDeposit(double amount){
        checkingBalance = (checkingBalance+amount);
        return checkingBalance;
    }
    public double calSavingDeposit(double amount){
        savingBalance = (savingBalance+amount);
        return savingBalance;
    }
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: "+moneyFormat.format((checkingBalance)));
        System.out.print("Amt you want to withdraw from checking account: ");
        double amount = input.nextDouble();

        if ((checkingBalance - amount) >=0){
            calCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: "+moneyFormat.format(checkingBalance));
        } else{
            System.out.println("Balance is not enough"+"\n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: "+moneyFormat.format((savingBalance)));
        System.out.print("Amt you want to withdraw from saving account: ");
        double amount = input.nextDouble();

        if ((savingBalance - amount) >=0){
            calSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: "+moneyFormat.format(savingBalance));
        } else{
            System.out.println("Balance is not enough"+"\n");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance"+ moneyFormat.format(checkingBalance));
        System.out.print("Amt you want to deposit from Checking account: ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount)>=0){
            calCheckingDeposit(amount);
            System.out.println("New Checking Account balance: "+ moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance can't be negative"+"\n");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance"+ moneyFormat.format(checkingBalance));
        System.out.print("Amt you want to deposit from saving account: ");
        double amount = input.nextDouble();

        if ((checkingBalance + amount)>=0){
            calSavingDeposit(amount);
            System.out.println("New Checking Account balance: "+ moneyFormat.format(checkingBalance));
        } else {
            System.out.println("Balance can't be negative"+"\n");
        }

    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance =0;

}
