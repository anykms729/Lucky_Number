package Project1;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Option_Menu extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    HashMap <Integer, Integer> data = new HashMap<Integer, Integer>();
    int selection;

    public void getLogin() throws IOException{
        int x=1;
        do{
            try {
                data.put(9876543, 9876); // way to insert value into the map
                data.put(8989898, 1890);
                data.put(89878898, 1891);
                System.out.println("Welcome to the ATM Project!");

                System.out.print("Enter your customer number: ");
                setCustomerNumber(menuInput.nextInt());

                System.out.print("Enter your pin number: ");
                setPinNumber(menuInput.nextInt());
            }
            catch (Exception e){
                System.out.println("\n"+ "Invalid Character(s). only numbers."+"\n");
                x= 2;
            }
            for (Map.Entry <Integer,Integer> entry : data.entrySet()) {
                if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber()){
                    getAccountType();
                    return;
            }}
              System.out.println("\n"+ "Wrong Customer Number or Pin number" +"\n");
        } while (x ==1);
    }

    /* Display account Type menu with selection*/
    public void getAccountType(){
        System.out.println("Select the Account you want to access: ");
        System.out.println("Type 1 - Checking Account");
        System.out.println("Type 2 - Saving Account");
        System.out.println("Type 3 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thanks for using this ATM, bye");
                break;

            default:
                System.out.println("\n"+ "Invalid choice" + "\n");
                getAccountType();
        }}

    public void getChecking(){
        System.out.println("Checking account: ");
        System.out.println("Type 1 - View balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanks for using this ATM, bye");
                break;
            default:
                System.out.println("\n"+"Invalid choice."+"\n");
                getChecking();
        }}
//    Display Saving Account Menu with selection
    public void getSaving(){
        System.out.println("Checking account: ");
        System.out.println("Type 1 - View balance");
        System.out.println("Type 2 - Withdraw funds");
        System.out.println("Type 3 - Deposit Funds");
        System.out.println("Type 4 - Exit");
        System.out.println("Choice: ");

        selection = menuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thanks for using this ATM, bye");
                break;
            default:
                System.out.println("\n"+"Invalid choice."+"\n");
                getChecking();
    }
}}
